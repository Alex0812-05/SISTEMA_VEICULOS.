package com.sistemaveiculos;

public class Bicicleta extends Veiculo {
	//Método para mostrar a marca, material, quantas marchas e se possui ou não amortecedor na bicicleta
    private String marca;
    private String material;
    private int qtdMarchas;
    private boolean possuiAmortecedor;

    //Construtor da classe Bicicleta com os atributos modelo, ano de fabricação, marca, material, quantas marchas e se possui amortecedor
    public Bicicleta(String modelo, int anoFabricacao, String marca, String material, int qtdMarchas, boolean possuiAmortecedor) {
        super(modelo, anoFabricacao);
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("A marca é obrigatória.");
        }
        if (material == null || material.isEmpty()) {
            throw new IllegalArgumentException("O material é obrigatório.");
        }
        this.marca = marca;
        this.material = material;
        this.qtdMarchas = qtdMarchas;
        this.possuiAmortecedor = possuiAmortecedor;
    }

    @Override
    //Construtor para gerar comando insert
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Bicicleta (modelo, anoFabricacao, marca, material, qtdMarchas, possuiAmortecedor) VALUES ('%s', %d, '%s', '%s', %d, %b);",
            getModelo(), getAnoFabricacao(), marca, material, qtdMarchas, possuiAmortecedor
        );
    }
}

