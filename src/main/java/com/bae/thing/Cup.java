package com.bae.thing;

public class Cup extends Thing implements Drinkable {
	
	@Override
	public void drink() {
		System.out.println("slurp");
	}


}
