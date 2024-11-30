package com.sistemaveiculos;

public class Main {
    public static void main(String[] args) {
    	//Instanciando os objetos para rodar o programa
        Veiculo automovel = new AutomovelDomestico("Fusca", 1980, 5, "Disco", true);
        Veiculo moto = new Motocicleta("Yamaha MT-07", 2022, 689, 67);
        Veiculo caminhao = new Caminhao("Scania", 2020, 6, 12000);
        Veiculo bicicleta = new Bicicleta("Caloi", 2021, "Caloi", "Alumínio", 21, true);
        Veiculo skate = new Skate("Longboard", 2023, "Santa Cruz", "Poliuretano");

        //Gerando o comando insert no console
        System.out.println(automovel.gerarComandoInsert());
        System.out.println(moto.gerarComandoInsert());
        System.out.println(caminhao.gerarComandoInsert());
        System.out.println(bicicleta.gerarComandoInsert());
        System.out.println(skate.gerarComandoInsert());
    }
}