package Arr3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arr3 {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static boolean ifTrue(String w1, String w2) {

		int counter = 0;

		Pattern pattern = Pattern.compile(w1);
		Matcher matcher = pattern.matcher(w2);

		while (matcher.find()) {

			System.out.println(matcher.group());
			System.out.println(matcher.start());
			System.out.println(matcher.end());

			counter++;

		}

		if (counter == 2) {

			System.out.println("ok, COUNTER = " + counter);

			return true;

		}

		System.out.println("COUNTER = " + counter);

		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String w1;
		String w2;

		do {

			System.out.println("Please insert two words: ");
			w1 = sc.nextLine();
			w2 = sc.nextLine();

		} while (!ifTrue(w1, w2));

		sc.close();

	}
}
