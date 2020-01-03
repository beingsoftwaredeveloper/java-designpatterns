
public class EspressoBuilder extends BeverageBuilder {

	private Espresso espresso = new Espresso();
	
	public void addEspressoPowder(EspressoPowder espressoPowder) {
		espresso.setEspressoPowder(espressoPowder);
		System.out.println("adding espresso powder");
	}
}
