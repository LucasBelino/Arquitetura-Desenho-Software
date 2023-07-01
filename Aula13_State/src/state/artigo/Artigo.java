package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artigo {
	
	private String estado;
	private List<String> logHistorico = new ArrayList<>();
	
	public Artigo() {
		this.estado = "RASCUNHO"; //estado inicial
	}
	
public void publicar() {
	GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

	if("RASCUNHO".equals(this.estado)) {
		if(gerenteDeSeguranca.ehUsuarioAutor()) {
			this.estado = "REVISANDO";
			this.logHistorico.add("Transitado para REVISANDO em "+LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario nao tem permissao para publicar");
		}
	}
	
	if("REVISANDO".equals(this.estado)) {
		if(gerenteDeSeguranca.ehUsuarioAutor()) {
			this.estado = "APROVADO";
			this.logHistorico.add("Transitado para APROVADO em "+LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario nao tem permissao para publciar");
		}
	}
	
	if("APROVADO".equals(estado)) {
		//faz nada
		return;
	}

}

public void reprovar() {
	GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
	
	if("RASCUNHO".equals(estado)) {
		//faz nada
		return;
	}
	
	if("REVISANDO".equals(estado)) {
		if(gerente.ehUsuarioModerador()) {
			this.estado = "RASCUNHO";
			logHistorico.add("Transitado para RASCUNHO em " +LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario nao tem permissao para reprovar ");
		}
	}
	
	if("APROVADO".equals(estado)) {
		//faz nada
		return;
	}

}
	
}
