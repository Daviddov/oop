package oop;

import java.util.Scanner;

public class Store {
	private String name;
	private int numOfSalse;
	private int percent;
	public Seller[] employees;
	Scanner in = new Scanner(System.in);

	public Store(String name, int numOfEmloyee, int numOfSalse, int percent) {
		this.name = name;
		this.employees = new Seller[numOfEmloyee];
		this.percent = percent;

		for (int i = 0; i < numOfEmloyee; i++) {
			System.out.print("please anter name");
			employees[i] = new Seller(in.next(), numOfSalse, percent);
		}
	}
	public Seller intEmployee(String name, int numOfSalse ) {
		for (int i = 0; i < employees.length; i++) {
//			chack if name is valid
			if(name == employees[i].getName()) {
			return null;
		}
		}
		return new Seller(name, numOfSalse, percent);
	}
	public void fireEmployee(String name) {
		if (chackNameExisit(name)) {
			for (int i = 0; i < employees.length; i++) {
				if(name == employees[i].getName()) {
					employees[i] = null;
					System.out.print("employee " +i + " is deleted");
				}
			}
		}
	}
	
	public boolean chackNameExisit(String name) {
		for (int i = 0; i < employees.length; i++) {
		if(name == employees[i].getName()) {
			return true;
		}
		}return false;
	}
}

