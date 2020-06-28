package com.wipro.Inheritance;

public class Person {
	private String name;
//	Person(String name){
//		this.name=name;
//	}
	Person(){
		System.out.println("Person Constructor Created");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
