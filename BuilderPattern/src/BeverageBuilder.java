import java.util.ArrayList;
import java.util.List;

public abstract class BeverageBuilder {

	Milk milk;
	Sugar sugar;
	Water water;
	
	public void addMilk(Milk milk) {
		this.milk = milk;
		System.out.println("adding milk");
	}
	public void addSugar(Sugar sugar) {
		this.sugar = sugar;
		System.out.println("adding sugar");
	}
	public void addWater(Water water) {
		this.water = water;
		System.out.println("adding water");
	}
	
	public void heat() {
		System.out.println("heating ...");
	}
	public void pour() {
		System.out.println("pouring");
	}
}
