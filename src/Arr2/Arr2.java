package Arr2;
import java.util.Scanner;

public class Arr2 {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static boolean ifSumIsPrime(String w) {

		boolean ifSumIsPrime = false;
		int sum = 0;
		int divisors = 0;

		char[] tab = w.toCharArray();

		for (int i = 0; i < tab.length; i++) {

			sum += tab[i];

		}

		for (int i = 1; i < Math.sqrt(sum); i++) {

			if (sum % i == 0) {

				divisors++;

			}

		}

		if (divisors <= 1 && sum > 10) {

			return true;

		}

		return ifSumIsPrime;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String w1, w2, w3;

		do {

			System.out.println("Plase insert three words: ");

			w1 = sc.nextLine();
			w2 = sc.nextLine();
			w3 = sc.nextLine();

		} while (!(ifSumIsPrime(w1) && !ifSumIsPrime(w2) && !ifSumIsPrime(w3)));

		sc.close();

		System.out.println("DONE");
	}

}
