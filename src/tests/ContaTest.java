package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contaBancariaAbstrata.Conta;

public class ContaTest {
	
	Conta umaConta;

	@Before
	public void setUp() throws Exception {
		umaConta = new Conta();
		umaConta.deposita(1000);
	}

	@Test
	public void testaDeposita() {
 
		assertEquals(1000.0, umaConta.getSaldo(),0.00001);
		
	}
	
	@Test
	public void testaSaca() {
		umaConta.saca(1000); 
		assertEquals(0.0, umaConta.getSaldo(),0.00001);
		
	}
	
	@Test
	public void testaAtualisa() {
		umaConta.atualiza(0.01); 
		assertEquals(1010.0, umaConta.getSaldo(),0.00001);
		
	}

}
