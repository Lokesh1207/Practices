package arraylearn;

import java.util.Scanner;

public class Studdetails {
	String name;
	int height;
	double weight;
	double bmr;
	int age;

	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.nextLine();

		System.out.println("Enter your age:");
		age = sc.nextInt();

		System.out.println("Enter your height:");
		height = sc.nextInt();

		System.out.println("Enter your weight:");
		weight = sc.nextDouble();

		bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
		System.out.println("Your Maintanence calories/day is:" + bmr);

	}
}
