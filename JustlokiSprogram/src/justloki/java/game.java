package justloki.java;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int min = 1;
		int max = 100;
		int rand = random.nextInt(max - min);
		int guess = 0;
		int i = 0;

		System.out.println("Pick a number between " + min + "and " + max + ".Try to guess it");
		while (guess != rand) {
			System.out.println("enter your guess:");
			guess = sc.nextInt();
			i++;
			if (guess > rand) {
				System.out.println("Higher!,Try again");
			} else if (guess < rand) {
				System.out.println("lower!,Try again");
			} else {
				System.out.println("congrats you found it");
			}
		}
	}
}


