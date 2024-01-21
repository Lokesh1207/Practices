package arraylearn;

import java.util.Scanner;

class StudentDetails { // created a class with student details
	String name;
	int rollnum;
	int dob;

	void display() { // creating a method named display
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your roll num: ");
		rollnum = sc.nextInt();
		System.out.print("Enter DOB: ");
		dob = sc.nextInt();

		System.out.println("Name: " + name);
		System.out.println("RollNum: " + rollnum);
		System.out.println("Date of birth: " + dob);
	}
}

public class Classdemo4 {

	public static void main(String[] args) {
		System.out.println("***STUDENT DETAILS***");
		StudentDetails s1 = new StudentDetails(); // creating a object s1 to access the methods and class
		s1.display();
	}
}
