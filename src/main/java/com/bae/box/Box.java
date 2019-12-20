package com.bae.box;

import com.bae.thing.Thing;

public class Box<T extends Thing> {
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	

}
