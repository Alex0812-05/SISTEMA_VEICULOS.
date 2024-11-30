package com.sistemaveiculos;

public class Motocicleta extends Veiculo {
	//Método para mostrar as cilindradas e o torque da motocicleta
    private int cilindradas;
    private int torque;

    //Construtor da classe Motocicleta com os atributos modelo, ano de fabricação, cilindradas e o torque
    public Motocicleta(String modelo, int anoFabricacao, int cilindradas, int torque) {
        super(modelo, anoFabricacao);
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("As cilindradas devem ser maiores que zero.");
        }
        if (torque <= 0) {
            throw new IllegalArgumentException("O torque deve ser maior que zero.");
        }
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    @Override
    //Construtor para o comando insert
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Motocicleta (modelo, anoFabricacao, cilindradas, torque) VALUES ('%s', %d, %d, %d);",
            getModelo(), getAnoFabricacao(), cilindradas, torque
        );
    }
}

