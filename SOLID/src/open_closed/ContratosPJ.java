package open_closed;

public class ContratosPJ implements Remuneravel{
	private Double ValorMensal;
	
	
	
	public ContratosPJ(Double ValorMensal) {
		super();
		this.ValorMensal = ValorMensal;
	}

	public Double getValorMensal() {
		return this.ValorMensal;
	}

	@Override
	public double getRemuneracao() {
		return this.ValorMensal;
	}
	
}
