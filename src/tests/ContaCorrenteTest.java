package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contaBancariaAbstrata.ContaCorrente;

public class ContaCorrenteTest {

	ContaCorrente umaConta;
	
	@Before
	public void setUp() throws Exception {
		umaConta = new ContaCorrente();
		umaConta.deposita(1000);
	}

	@Test
	public void testaDeposita() {
 
		assertEquals(999.9, umaConta.getSaldo(),0.00001);
		
	}
	
	@Test
	public void testaSaca() {
		umaConta.saca(1000); 
		assertEquals(-0.1, umaConta.getSaldo(),0.00001);
		
	}
	
	@Test
	public void testaAtualisa() {
		umaConta.atualiza(0.01); 
		assertEquals(1019.898, umaConta.getSaldo(),0.00001);
		
	}

}
