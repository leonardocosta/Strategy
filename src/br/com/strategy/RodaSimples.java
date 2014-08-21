package br.com.strategy;



public class RodaSimples implements Produto {

	private double taxaDeImposto = 0.1;
	private double valorRodaDeSimples = 20.00;
	private String tipoDePeca = "Simples";

	@Override
	public String verificarPrecoDaPeca() {
	
		double valor = valorRodaDeSimples
				+ (valorRodaDeSimples * taxaDeImposto);

		String rodaSimples = "Valor: " + valor;
		return rodaSimples;
	}

	@Override
	public String tipoDaPeca() {
		
		return this.tipoDePeca;
	}

}
