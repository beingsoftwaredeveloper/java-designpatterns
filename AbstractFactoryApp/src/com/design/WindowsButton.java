package com.design;

public class WindowsButton implements Button {

	@Override
	public void init() {
		System.out.println("windows button initialization");
	}

	@Override
	public void draw() {
		System.out.println("draw windows button");
	}

}
