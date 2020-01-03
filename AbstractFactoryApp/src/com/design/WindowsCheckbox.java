package com.design;

public class WindowsCheckbox implements Checkbox {

	@Override
	public void init() {
		System.out.println("windows checkbox initialization");
	}

	@Override
	public void draw() {
		System.out.println("draw windows checkbox");
	}

}
