
public class Program {

	public static void main(String[] args) {
		AbstractProduct.thePrototype = new ConcreteProduct();
		AbstractProduct product = AbstractProduct.makeProduct();
		System.out.println(product);
	}

}
