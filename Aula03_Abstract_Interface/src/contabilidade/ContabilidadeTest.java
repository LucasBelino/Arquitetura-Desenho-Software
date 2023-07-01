package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {
	
	@Test
	void testarEmpresaMEI() {
		EmpresaMEI empresa = new EmpresaMEI(100.0);
		Double valorIR = empresa.getValorIR();
		Double valorISS = empresa.getValorISS();
		Double valorIREsperado = 27.5;
		Double valorISSEsperado = 0.0;
		
		assertEquals(valorIREsperado, empresa.getValorIR()); //Para testar o IR
		assertEquals(valorISSEsperado, empresa.getValorISS()); //Para testar o ISS
	}
	
	@Test
	void testarEmpresaSimples() {
		EmpresaSimples empresa2 = new EmpresaSimples(100.0);
		Double valorIR = empresa2.getValorIR();
		Double valorISS = empresa2.getValorISS();
		Double valorIREsperado = 15.0;
		Double valorISSEsperado = 8.0;
		
		assertEquals(valorIREsperado, empresa2.getValorIR());
		assertEquals(valorISSEsperado, empresa2.getValorISS());

	}
}
