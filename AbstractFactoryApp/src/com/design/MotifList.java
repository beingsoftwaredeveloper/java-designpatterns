package com.design;

public class MotifList implements List {

	@Override
	public void init() {
		System.out.println("motif list initialization");
	}

	@Override
	public void draw() {
		System.out.println("draw motif list");
	}

}
