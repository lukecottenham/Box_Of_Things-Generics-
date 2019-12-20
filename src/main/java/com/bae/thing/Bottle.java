package com.bae.thing;

public class Bottle extends Thing implements Drinkable {
	
	@Override
	public void drink() {
		System.out.println("glug glug");
	}

}
