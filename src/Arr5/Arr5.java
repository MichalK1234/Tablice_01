package Arr5;
import java.util.Scanner;

public class Arr5 {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static boolean binaryCheck(String i) {

		int counter = 0;

		char[] arr = i.toCharArray();

		for (int j = 0; j < arr.length; j++) {

			if (Character.getNumericValue(arr[j]) == 1) {

				counter++;
			}
		}

		System.out.println(counter);

		if (counter >= 3) {

			return true;
		}

		return false;
	}

	public static int countHex(String l) {

		int sum = 0;

		char[] arr = l.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			String num = String.valueOf(arr[i]);

			if (num.matches("[0-9]")) {

				sum += Integer.parseInt(num);
			}

		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dec;
		String bin;

		do {

			System.out.println("Enter a positive integer");
			dec = Integer.parseInt(sc.nextLine());
			bin = Integer.toBinaryString(dec);

		} while (!binaryCheck(bin));

		System.out.println(Long.toHexString(dec));
		System.out.println("Sum of hexadecimal numbers: " + countHex(Long.toHexString(dec)));

		sc.close();

	}
}
