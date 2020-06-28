package com.wipro.OverridingAndPolymorphism;

public class Orange extends Fruit {
	public Orange(String name,String taste,String size){
		super(name,taste,size);
	}
	public void eat() {
		System.out.println(super.name+" taste like "+super.taste);
	}
}
