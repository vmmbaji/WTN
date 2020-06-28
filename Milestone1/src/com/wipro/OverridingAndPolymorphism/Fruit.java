package com.wipro.OverridingAndPolymorphism;

public class Fruit {
	protected String name;
	protected String taste;
	protected String size;
	public Fruit(String name,String taste,String size) {
//		super();
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println(name+" and "+taste);
	}
}
