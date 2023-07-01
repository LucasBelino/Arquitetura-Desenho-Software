import org.junit.jupiter.api.Test;

public class PizzaBuilder {

	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese( true );
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni( true );
		return this;
	}
	
	private void validateSize() {
		if(pizza.getSize() < 1 || pizza.getSize() > 3) {
			throw new IllegalStateException("Tamanho invalido!");
		}
	}
	
	private void validateIngredient() {
		if(!pizza.getFlagPepperoni() && pizza.getFlagCheese()) {
			throw new IllegalStateException("Deve ter ao menos 1 igrediente");
		}
	}
	
	public Pizza getPizza() {
		validateSize();
		validateIngredient();
		return pizza;
	}
	
}
