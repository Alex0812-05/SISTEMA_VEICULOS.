package com.sistemaveiculos;

public class Caminhao extends Veiculo {
	//Método para saber quantos eixos e o peso bruto do caminhão
    private int qtdEixos;
    private double pesoBruto;

    //Construtor da classe Caminhão com os atributos modelo, ano de fabricação, quantos eixos e o peso bruto
    public Caminhao(String modelo, int anoFabricacao, int qtdEixos, double pesoBruto) {
        super(modelo, anoFabricacao);
        if (qtdEixos <= 0) {
            throw new IllegalArgumentException("A quantidade de eixos deve ser maior que zero.");
        }
        if (pesoBruto <= 0) {
            throw new IllegalArgumentException("O peso bruto deve ser maior que zero.");
        }
        this.qtdEixos = qtdEixos;
        this.pesoBruto = pesoBruto;
    }

    @Override
    //Construtor para gerar comando insert
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Caminhao (modelo, anoFabricacao, qtdEixos, pesoBruto) VALUES ('%s', %d, %d, %.2f);",
            getModelo(), getAnoFabricacao(), qtdEixos, pesoBruto
        );
    }
}

