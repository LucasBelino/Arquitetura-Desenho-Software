package open_closed;

public class FolhaDePagamento {
	
	private Double totalFolha = 0.0;
	
	public void calcular(Remuneravel r) {
		totalFolha += r.getRemuneracao();
	}
	
	// CODIGO DE FERE DO OPEN-CLOSED
	//public void calcular(Object f) {
	//	if (f instanceof ContratoCLT) {
	//		ContratoCLT clt = (ContratoCLT) f;
	//		totalFolha += clt.getSalario();
	//
	//	} else if (f instanceof Estagio) {
	//		Estagio e = (Estagio) f;
	//		totalFolha += e.getBolsaAuxilio();
	//	}
	//}

	public Double getTotalFolha() {
		return totalFolha;
	}
	

}
