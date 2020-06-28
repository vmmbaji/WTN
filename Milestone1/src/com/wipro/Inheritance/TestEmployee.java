package com.wipro.Inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Mahesh");
		e.setAnnualsal(650000.00);
		e.setEmpStartYear(2011);
		e.setNatInsNum("emp123");
		System.out.println("Name of the person is "+e.getName());
		System.out.println("Employee Annual Salary is "+e.getAnnualsal());
		System.out.println("Employee Start Year is "+e.getEmpStartYear());
		System.out.println("Employee National Insurence Number is "+e.getNatInsNum());
	}
}
