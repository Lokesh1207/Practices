package Practice;

import java.util.Scanner;

public class Watertax {
	static double waterTax(double units) {
		double costPerUnit = 0;
		if (units < 100) {
			costPerUnit = 1.0;
		} else if (units>=100 && units <= 500) {
			costPerUnit = 1.5;
		} else {
			costPerUnit = 3.0;
		}
		return units * costPerUnit; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UNITS: ");
		double units = sc.nextDouble();
		System.out.printf("Water Tax: %.2f%n", waterTax(units));
	}
}
