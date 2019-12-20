package com.bae.thing;

public class TeaBag extends Thing{
	
	public void makeTea(Boolean likeTea) {
		if (likeTea == true) {
			System.out.println("Mmmmmmm");
		}
		else {
			System.out.println("eurgh");
		}
	}

}
