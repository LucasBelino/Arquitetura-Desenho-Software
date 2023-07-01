package state.artigo;

public class GerenteDeSeguranca {
	
	private static GerenteDeSeguranca instance;
	
	public boolean ehUsuarioAutor() {
		// TODO Auto-generated method stub
		return false;
	}

	public static GerenteDeSeguranca getInstance() {
		if(instance == null) {
			instance = new GerenteDeSeguranca();
		}
		return instance;
	}

	public boolean ehUsuarioModerador() {
		// TODO Auto-generated method stub
		return false;
	}

}
