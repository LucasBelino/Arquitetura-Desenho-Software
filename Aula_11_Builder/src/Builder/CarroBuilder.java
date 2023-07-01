package Builder;

public class CarroBuilder {
	
	private Carro carro;
	
	public CarroBuilder() {
		 this.carro = new Carro();
	}
	
	public void buildPorta(Porta[] portas) {
		carro.setPorta(portas);
	}
	
	public Carro getCarro() {
		
		private void validarPorta() {
			if(carro.getPorta().lenght == null || (carro.getPorta().lenght != 2 &&
					carro.getPorta().lenght != 4)) {
				throw new IllegalStateExpection("Nro de portas invalido");
			}
		}
		
		return this.getCarro();
	}
	
}
