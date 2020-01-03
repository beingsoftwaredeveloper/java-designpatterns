
public class CapachinoBuilder extends BeverageBuilder {

	private Capachino capachino = new Capachino();
	
	public void addCapachinoPowder(CapachinoPowder capachinePowder) {
		capachino.setCapachinePowder(capachinePowder);
		System.out.println("adding capachino powder");
	}
}
