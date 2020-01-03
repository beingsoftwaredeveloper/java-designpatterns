
public class CoffeeBuilder extends BeverageBuilder {

	private Coffe coffe = new Coffe();
	
	public void addCoffeePowder(CoffePowder coffePowder) {
		coffe.setCoffePowder(coffePowder);
		System.out.println("adding coffee powder");
	}
	
}
