package Arr1;
import java.util.Scanner;

public class Arr1 {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static boolean ifPalindrome(StringBuilder palindrome) {

		if (palindrome.toString().matches(palindrome.reverse().toString())) {

			return true;

		}

		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringBuilder palindrome = new StringBuilder();

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		do {

			sb1 = new StringBuilder();
			sb2 = new StringBuilder();
			palindrome = new StringBuilder();

			System.out.println("Please insert two words: ");

			String w1 = sc.nextLine();
			String w2 = sc.nextLine();

			char[] arr1 = w1.toCharArray();

			for (int i = 0; i < arr1.length; i++) {

				if (i % 2 == 0) {

					sb1.append(arr1[i]);

				}
			}
			char[] arr2 = w2.toCharArray();

			for (int i = 0; i < arr2.length; i++) {

				if (i % 2 != 0) {

					sb2.append(arr2[i]);

				}

			}

			palindrome.append(sb1);
			palindrome.append(sb2);

		} while (!ifPalindrome(palindrome));
		sc.close();

		System.out.println("DONE");
	}

}
