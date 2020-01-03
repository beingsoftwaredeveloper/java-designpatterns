public class VendingMachine {

	CoffeeBuilder coffeBuilder;
	TeaBuilder teaBuilder;
	GreenTeaBuilder greenTeaBuilder;
	EspressoBuilder espressoBuilder;
	CapachinoBuilder capachinoBuilder;
	Milk milk = new Milk();
	Sugar sugar = new Sugar();
	Water water = new Water();
	CoffePowder coffePowder = new CoffePowder();
	TeaPowder teaPowder = new TeaPowder();
	CapachinoPowder capachinePowder = new CapachinoPowder();
	EspressoPowder espressoPowder = new EspressoPowder();
	GreenTeaPowder greenTeaPowder = new GreenTeaPowder();
	
	
	public void prepare(BeverageChoice beverageChoice) {
		switch(beverageChoice) {
		case COFFE:
				coffeBuilder = new CoffeeBuilder();
				coffeBuilder.addMilk(milk);
				coffeBuilder.addWater(water);
				coffeBuilder.addSugar(sugar);
				coffeBuilder.addCoffeePowder(coffePowder);
				coffeBuilder.heat();
				coffeBuilder.pour();
				break;
		case TEA:
			teaBuilder = new TeaBuilder();
			teaBuilder.addMilk(milk);
			teaBuilder.addWater(water);
			teaBuilder.addSugar(sugar);
			teaBuilder.addTeaPowder(teaPowder);
			teaBuilder.heat();
			teaBuilder.pour();
				break;
		case GREENTEA:
			greenTeaBuilder = new GreenTeaBuilder();
			greenTeaBuilder.addWater(water);
			greenTeaBuilder.addGreenTeaPowder(greenTeaPowder);
			greenTeaBuilder.heat();
			greenTeaBuilder.pour();
				break;
		case ESPRESSO:
			espressoBuilder = new EspressoBuilder();
			espressoBuilder.addMilk(milk);
			espressoBuilder.addSugar(sugar);
			espressoBuilder.addWater(water);
			espressoBuilder.addEspressoPowder(espressoPowder);
			espressoBuilder.heat();
			espressoBuilder.pour();
				break;
		case CAPACHINO:
			capachinoBuilder = new CapachinoBuilder();
			capachinoBuilder.addWater(water);
			capachinoBuilder.addMilk(milk);
			capachinoBuilder.addSugar(sugar);
			capachinoBuilder.addCapachinoPowder(capachinePowder);
			capachinoBuilder.heat();
			capachinoBuilder.pour();
			break;
		}
	}
}
