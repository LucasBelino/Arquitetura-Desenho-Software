package banco;

public class ContaPoupança extends Conta{

	@Override
	void rentabilizar() {
		this.saldo *= 1.02; //Saldo da conta poupança rentabiliza 2%
	}
	
}
