package br.com.strategy.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import br.com.strategy.Roda;
import br.com.strategy.RodaDeLigaLeve;
import br.com.strategy.RodaSimples;

public class RodaTest {

	Roda roda = null;

	@Before
	public void inicio() {
		roda = new Roda();
    	roda.cadrastraPecaDeCarro("Roda");
    	roda.cadrastraPecaDeCarro("Aro 15");
    				
	}

	@Test
	public void VerificaRodaSimples() {
		roda.verificaValorDaPeca(new RodaSimples());
		assertEquals("Roda Simples, Aro 15, Valor: 22.0", roda.getDados(2));
	}

	@Test
	public void VerificaRodaDeLigaLeve() {
		roda.verificaValorDaPeca(new RodaDeLigaLeve());
		assertEquals("Roda De Liga Leve, Aro 15, Valor: 36.0", roda.getDados(2));
	}

}
