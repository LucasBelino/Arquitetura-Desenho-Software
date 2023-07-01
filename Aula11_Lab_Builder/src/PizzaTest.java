import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class PizzaTest {
	
	@Test
	void deveConstruirPizzaValida() {
		
		Pizza pizza = new PizzaBuilder()
		.setSize(1)
		.addCheese()
		.addPepperoni()
		.getPizza();
		
		assertNotNull( pizza );
		assertNotNull( pizza.getSize() );
		assertTrue( pizza.getFlagCheese() );
		assertTrue( pizza.getFlagPepperoni() );
	}
	
	@Test
	void deveConstruirPizzaInvalida() {
		
		Pizza pizza = new PizzaBuilder()
		.setSize(4)
		.getPizza();
		
		assertNotNull( pizza );
		try {
			assertEquals( pizza.getSize() );
		} catch (Exception e) {
			
		}
	}

}
