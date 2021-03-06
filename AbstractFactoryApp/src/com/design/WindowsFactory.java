package com.design;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

	@Override
	public List createList() {
		return new WindowsList();
	}

}
