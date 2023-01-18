package oop;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		Seler moshe = new Seler("Moshe", 3);
//		moshe.addSale(50);
//		moshe.addSale(10);
//		moshe.addSale(40);
//		moshe.addSale(410);
//		moshe.addSale(70);
//		moshe.addSale(110);
//		System.out.println(moshe.calculateBounus(10)); 
//		double[] arr = moshe.getBounusSales();
//		System.out.println(Arrays.toString(arr));
		
		Store zaraStore = new Store("zara", 5, 3, 10);
		zaraStore.employees[2] =zaraStore.intEmployee("moshe", 10);
		zaraStore.employees[2].addSale(50);
		zaraStore.employees[2].addSale(540);
		zaraStore.employees[2].addSale(250);
		System.out.println(zaraStore.employees[2].calculateBounus(10));
	
	}
}
