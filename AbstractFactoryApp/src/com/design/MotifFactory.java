package com.design;

public class MotifFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new MotifButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MotifCheckbox();
	}

	@Override
	public List createList() {
		return new MotifList();
	}

}
