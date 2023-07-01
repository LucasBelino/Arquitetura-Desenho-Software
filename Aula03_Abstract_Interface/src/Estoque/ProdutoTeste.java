package Estoque;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class ProdutoTeste {

	@Test
	void testarProduto() {
		
		Produto p = new Produto();
		p.setDescricao("Queijo Minas 1KG ");
		p.setValorCompra( 50.00 );
		p.setDataValidade( LocalDate.of(2022, Month.DECEMBER, 30));
		
		System.out.println("Dados do Produto");
		System.out.println(p.getDescricao());
		System.out.println(p.getValorCompra());
		System.out.println(p.getDataValidade());

	}
}
