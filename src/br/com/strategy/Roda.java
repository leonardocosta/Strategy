package br.com.strategy;

import java.util.ArrayList;
import java.util.List;

public class Roda {

	private List<String> tiposDeRoda = null;

	public Roda() {
		this.tiposDeRoda = new ArrayList<String>();
	}

	public void cadrastraPecaDeCarro(String nome) {
		tiposDeRoda.add(nome);
	}

	public void verificaValorDaPeca(Produto produto) {
		this.tiposDeRoda.add(getDados(0) + " " + produto.tipoDaPeca() + ", "
				+ getDados(1) + ", " + produto.verificarPrecoDaPeca());

	}

	public String getDados(int pos) {
		return this.tiposDeRoda.get(pos);
	}

}
