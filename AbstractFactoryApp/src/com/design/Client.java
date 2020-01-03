package com.design;

public class Client {

	public static void main(String[] args) {

		AbstractFactory factory = new WindowsFactory();
		
		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();
		List list = factory.createList();
		
		button.init();
		checkbox.init();
		list.init();
		button.draw();
		checkbox.draw();
		list.draw();
		
		factory = new MotifFactory();
		button = factory.createButton();
		checkbox = factory.createCheckbox();
		list = factory.createList();
		
		button.init();
		checkbox.init();
		list.init();
		button.draw();
		checkbox.draw();
		list.draw();
		
		
	}

}
