package oop;

public class Seller {
	private String name;
	private double[] bounsSalse;
	private int percent;

	public Seller(String name, int numOfSalse, int percent) {
		this.name = name;
		this.bounsSalse = new double[numOfSalse];
		this.percent = percent;
	}

	
	public void addSale(double sale) {
		double temp;
		if (sale > bounsSalse[0]) {
			bounsSalse[0] = sale;
		}
//	sort arr
		for (int i = 0; i < bounsSalse.length - 1; i++) {
			if (bounsSalse[i] > bounsSalse[i + 1]) {
				temp = bounsSalse[i];
				bounsSalse[i] = bounsSalse[i + 1];
				bounsSalse[i + 1] = temp;
			} else {
				break;
			}
		}
	}

	public double calculateBounus(int percent) {
		double sum = 0;
		for (int i = 0; i < bounsSalse.length; i++) {
			sum += bounsSalse[i] * percent / 100;
		}
		return sum;
	}

	public double[] getBounusSales() {
		double[] copyBounusSales = new double[bounsSalse.length];
		for (int i = 0; i < bounsSalse.length; i++) {
			copyBounusSales[i] = bounsSalse[i];
		}
		return copyBounusSales;
	}
	public String getName() {
		return this.name;
	}
}
