package Practice;

import java.util.Scanner;

public class employee {

	static String employeeId(String s, String dob, String gender) {
		StringBuffer sb = new StringBuffer();
		
		char c = s.charAt(0);
		sb.append(c);
		char date1 = dob.charAt(0);
		sb.append(date1);
		char date2 = dob.charAt(1);
		sb.append(date2);
		if (gender.equalsIgnoreCase("Female")) {
			char date3 = dob.charAt(3);
			date3 += 5;
			sb.append(date3);
		} else {
			sb.append(dob.charAt(3));
		}
		char date4 = dob.charAt(4);
		sb.append(date4);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String s = sc.nextLine();
		System.out.println("Enter date of birth (dd-mm-yyyy): ");
		String dob = sc.nextLine(); 
		System.out.println("Enter gender (Male/Female): ");
		String gender = sc.nextLine();

		System.out.println("Employee Id: " + employeeId(s, dob, gender));

	}
}
