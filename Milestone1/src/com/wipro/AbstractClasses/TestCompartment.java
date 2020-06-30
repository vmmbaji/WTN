package com.wipro.AbstractClasses;
import java.util.Random;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		System.out.println("This is a First Class Compartment");
		return null;
	}
}
class Ladies extends Compartment{
	public String notice() {
		System.out.println("This is a Ladies Compartment");
		return null;
	}
}
class General extends Compartment{
	public String notice() {
		System.out.println("This is a General Compartment");
		return null;
	}
}
class Luggage extends Compartment{
	public String notice() {
		System.out.println("This is a Luggage Compartment");
		return null;
	}
}
public class TestCompartment {
	public static void main(String[] args) {
		Compartment []a=new Compartment[10];
		Random r=new Random();
		int n;
		for(int i=0;i<10;i++) {
			n=r.nextInt(4);
			if(n==0)
				a[i]=new FirstClass();
			else if(n==1)
				a[i]=new Ladies();
			else if(n==2)
				a[i]=new General();
			else
				a[i]=new Luggage();
			a[i].notice();
		}
		
	}
}
