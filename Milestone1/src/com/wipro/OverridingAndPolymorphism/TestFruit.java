package com.wipro.OverridingAndPolymorphism;

public class TestFruit {
	public static void main(String[] args) {
		Fruit f=new Fruit("Fruit name","Fruit taste","Fruit size");
		Apple a=new Apple("Apple","Sweet","Medium");
		Orange o=new Orange("Orange","Sweet and Bitter","Medium");
		f.eat();
		a.eat();
		o.eat();
		
	}
}
