package single_responsabilty;

public class Pedido {
	
	//Model
	public void calcularTotal() {}
	public void getItems() {}
	public void adicionarItems() {}
	public void deletarItems() {}
	
	//Viewer
	public void imprimirPedido() {}
	public void mostrarPedido() {}
	
	//Repository = Banco de Dados
	public void search() {}
	public void insert() {}
	public void update() {}
	public void delete() {}
}
