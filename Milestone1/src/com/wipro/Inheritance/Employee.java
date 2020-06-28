package com.wipro.Inheritance;

public class Employee extends Person {
	private double annualsal;
	private int EmpStartYear;
	private String NatInsNum;
//	Employee(double annualsal,int EmpStartYear,String NatInsNum){
//		this.annualsal=annualsal;
//		this.EmpStartYear=EmpStartYear;
//		this.NatInsNum=NatInsNum;
//	}
	Employee(){
		System.out.println("Employee Constructer is Created");
	}
	public void setAnnualsal(double annualsal) {
		this.annualsal=annualsal;
	}
	public double getAnnualsal() {
		return this.annualsal;
	}
	public void setEmpStartYear(int EmpStartYear) {
		this.EmpStartYear=EmpStartYear;
	}
	public int getEmpStartYear() {
		return this.EmpStartYear;
	}
	public void setNatInsNum(String NatInsNum) {
		this.NatInsNum=NatInsNum;
	}
	public String getNatInsNum() {
		return this.NatInsNum;
	}
}
