
public class Client {

	public static void main(String[] args) {

		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.prepare(BeverageChoice.COFFE);
		vendingMachine.prepare(BeverageChoice.TEA);
		vendingMachine.prepare(BeverageChoice.GREENTEA);
		vendingMachine.prepare(BeverageChoice.ESPRESSO);
		vendingMachine.prepare(BeverageChoice.CAPACHINO);
		
	}

}
