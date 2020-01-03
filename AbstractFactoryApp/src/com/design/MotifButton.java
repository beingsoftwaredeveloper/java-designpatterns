package com.design;

public class MotifButton implements Button {

	@Override
	public void init() {
		System.out.println("motif button initialization");
	}

	@Override
	public void draw() {
		System.out.println("draw motif button");
	}

}
