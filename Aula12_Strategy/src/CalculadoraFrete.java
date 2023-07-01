public abstract class CalculadoraFrete implements Fretavel{

	public double calcularValor(Fretavel fretavel, double pesoEmKg) {
		double valor = fretavel.calcularValor(pesoEmKg);
		return valor;
	}

}
