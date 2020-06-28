package com.wipro.Inheritance;
class Animal{
	void eat() {
		System.out.println("parent class eat method");
	}
	void sleep() {
		System.out.println("parent class sleep method");
	}
	Animal(){
		this.eat();
		this.sleep();
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("child class eat method");
	}
	void sleep() {
		System.out.println("child class sleep method");
	}
	void fly() {
		System.out.println("child class fly method");
	}
	Bird(){
		this.eat();
		this.sleep();
		this.fly();
	}
}
public class AnimalBird {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}
