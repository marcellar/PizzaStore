package pizzaOrders;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;

		if (item.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();		
		} else if (item.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();		
		} else if (item.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		return pizza;
	}
}
