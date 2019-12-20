package com.bae.app;

import com.bae.box.Box;
import com.bae.thing.Thing;
import com.bae.thing.ToyPlane;

public class App {

	public static void main(String[] args) {
		
		Box<ToyPlane> box = new Box<>();
		box.setItem(new ToyPlane());
		box.getItem().fly();
		
	}

}
