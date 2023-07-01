package open_closed;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testeFolhaDePagamento {
	
	@Test
	public void deveCalcular() {
		
		ContratoCLT contratoCLT = new ContratoCLT(30000.0);
		Estagio estagio = new Estagio(3000.0);
		ContratosPJ contratoPJ = new ContratosPJ(5000.0);
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.calcular(contratoCLT);
		folhaDePagamento.calcular(estagio);
		folhaDePagamento.calcular(contratoPJ);
		
		Double totalFolha = folhaDePagamento.getTotalFolha();
		assertEquals(38000.0, totalFolha);
	}
}
