package br.com.strategy;



public class RodaDeLigaLeve implements Produto {

	private double taxaDeImposto = 0.2;
	private double valorRodaDeLigaLeve = 30.00;
	private String tipoDePeca = "De Liga Leve";

	@Override
	public String verificarPrecoDaPeca() {
		
		double valor = valorRodaDeLigaLeve
				+ (valorRodaDeLigaLeve * taxaDeImposto);


		String rodaDeLigaLeve = "Valor: " +  valor;
		return rodaDeLigaLeve;

	}

	@Override
	public String tipoDaPeca() {
		
		return tipoDePeca;
	}

}
