package com.sistemaveiculos;

public abstract class Veiculo {
	//Método para mostrar o modelo e ano de fabricação do veiculo
    private String modelo;
    private int anoFabricacao;

    //Construtor da classe Veiculo com os atributos modelo e ano de fabricação
    public Veiculo(String modelo, int anoFabricacao) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("O modelo é obrigatório.");
        }
        if (anoFabricacao <= 0) {
            throw new IllegalArgumentException("O ano de fabricação deve ser maior que zero.");
        }
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //Métodos getters e setters
    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public abstract String gerarComandoInsert();
}

