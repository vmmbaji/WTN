package com.wipro.OverridingAndPolymorphism;

public class Apple extends Fruit{
	public Apple(String name,String taste,String size){
		super(name,taste,size);
	}
	public void eat() {
		System.out.println(super.name+" taste like "+super.taste);
	}
}
