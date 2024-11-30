package com.sistemaveiculos;

public class Skate extends Veiculo {
	//Método para mostrar a marca e o tipo de roda que o skate usa
    private String marca;
    private String tipoRodas;

    //Construtor da classe Skate com os atributos modelo, ano de fabricação, marca e o tipo de roda
    public Skate(String modelo, int anoFabricacao, String marca, String tipoRodas) {
        super(modelo, anoFabricacao);
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("A marca é obrigatória.");
        }
        if (tipoRodas == null || tipoRodas.isEmpty()) {
            throw new IllegalArgumentException("O tipo das rodas é obrigatório.");
        }
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    @Override
    //Construtor para gerar o comando insert
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Skate (modelo, anoFabricacao, marca, tipoRodas) VALUES ('%s', %d, '%s', '%s');",
            getModelo(), getAnoFabricacao(), marca, tipoRodas
        );
    }
}
