package banco;

public class ContaCorrente extends Conta{

	@Override //Subscrever o método
	void rentabilizar() {
		this.saldo *= 1.01; //Saldo da conta corrente rentabiliza 1%
	}

}
