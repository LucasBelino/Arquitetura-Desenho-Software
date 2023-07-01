package banco;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
	
	@Test
	void testeConta_toString() {
		Conta conta = new ContaCorrente();
		conta.depositar( 100.00 );
		conta.sacar( 10.00 );
		
		String str = conta.toString(); //toString de conta
		System.out.println( str );
	}
	
	
	@Test
	void testPolimorfismo() {
		boolean flagContaCorrenteComoDefault = true;
		
		Conta conta = null;
		if(flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
		} else {
			conta = new ContaPoupança();
		}
		
		conta.depositar( 1000.00 );
		conta.rentabilizar();
		
		System.out.println( conta.getClass().getName());
		System.out.println( conta.saldo);
	}
	
	@Test
	void testarContaCorrente() {
		Double saldoEsperado = 101.0;		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar( 100.0 );
		contaCorrente.rentabilizar();
				
		assertEquals(saldoEsperado, contaCorrente.saldo); //Saldo esperado deve ser igual ao saldo após depósito
	}
	
	@Test
	void testarContaPoupança() {
		Double saldoEsperado = 81.6;		
		ContaPoupança contaPoupança = new ContaPoupança();
		contaPoupança.depositar( 100.0 );
		contaPoupança.sacar( 20.0 ); //Ao sacarmos 20$ ele irá executar this.saldo -= valor
		contaPoupança.rentabilizar(); //Ao rentabilizar ele irá executar this.saldo *= 1.02 (Somando 2% do valor)
				
		assertEquals(saldoEsperado, contaPoupança.saldo); //Saldo esperado deve ser igual ao saldo após depósito
	}
}
