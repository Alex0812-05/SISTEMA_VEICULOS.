package com.sistemaveiculos;


public class AutomovelDomestico extends Veiculo {
	
	//Método para o maximo de passageiros, o tipo de freio e se possui ou não airbag
    private int maxPassageiros;
    private String tipoFreio;
    private boolean possuiAirbag;

    //Construtor da classe AutomovelDomestico com o modelo, ano de fabricação, maximo de passageiros, o tipo de freio e se possui ou não airbag
    public AutomovelDomestico(String modelo, int anoFabricacao, int maxPassageiros, String tipoFreio, boolean possuiAirbag) {
        super(modelo, anoFabricacao);
        if (maxPassageiros <= 0) {
            throw new IllegalArgumentException("A quantidade máxima de passageiros deve ser maior que zero.");
        }
        if (tipoFreio == null || tipoFreio.isEmpty()) {
            throw new IllegalArgumentException("O tipo de freio é obrigatório.");
        }
        this.maxPassageiros = maxPassageiros;
        this.tipoFreio = tipoFreio;
        this.possuiAirbag = possuiAirbag;
    }

    @Override
    //Construtor para gerar comando insert
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO AutomovelDomestico (modelo, anoFabricacao, maxPassageiros, tipoFreio, possuiAirbag) VALUES ('%s', %d, %d, '%s', %b);",
            getModelo(), getAnoFabricacao(), maxPassageiros, tipoFreio, possuiAirbag
        );
    }
}
