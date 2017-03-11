package Arr2D;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arr2D {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static int fun1(int[][] arrN) {

		int counter = 0;
		int tempCounter = 0;

		for (int i = 0; i < arrN.length; i++) {
			int[] row = arrN[i];
			if (Arrays.stream(row).allMatch(p -> p % row[0] == 0)) {
				++counter;
			}

			tempCounter = 0;

		}

		return counter;
	}

	public static boolean checkLine(int[] arr) {

		IntStream ss = IntStream.of(Arrays.stream(arr).toArray());
		Stream<Integer> ss2 = ss.mapToObj(x -> new Integer(x));
		IntStream ss1 = IntStream.of(Arrays.stream(arr).toArray());
		Stream<Integer> ss3 = ss1.mapToObj(x -> new Integer(x));
		String nap2 = ss2.sorted((s1, s2) -> Integer.compare(s2, s1)).map(x -> x.toString())
				.collect(Collectors.joining(""));
		String nap3 = ss3.map(x -> x.toString()).collect(Collectors.joining(""));
		return nap2.length() == nap3.length() && nap2.equals(nap3);
	}

	public static int fun2() {

		int[][] arrN = new int[][] { { 3, 4, 2, 3 }, { 9, 6, 7, 6, 9 }, { 18, 9, 9, 18 }, { 2, 2 } };

		int counter = 0;

		for (int i = 0; i < arrN.length; i++) {

			if (arrN[i].length % 2 == 0 && checkLine(arrN[i])) {

				counter++;

			}
		}

		return counter;
	}

	public static int findMax(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}

	public static double fun3(int[][] arrN) {

		int sum = 0;

		for (int i = 1; i < arrN.length; i++) {

			if (findMax(arrN[i]) % i == 0) {

				sum += Arrays.stream(arrN[i]).sum();
			}
		}

		return sum;
	}

	public static int[][] fun4(int[][] arrN) {

		int[][] arrNew = new int[arrN.length][];
		int sum = 0;

		for (int i = 0; i < arrN.length; i++) {

			sum = 0;
			arrNew[i] = new int[arrN[i].length];

			for (int j = 0; j < arrN[i].length - 1; j++) {

				sum += arrN[i][j];
				arrNew[i][j] = arrN[i][j];

			}

			arrNew[i][arrNew[i].length - 1] = sum % 10;

		}

		return arrNew;
	}

	public static void main(String[] args) {

		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);

		System.out.print("Insert number of an array lines: ");
		int lines = sc.nextInt();

		int[][] arrN = new int[lines][];

		for (int i = 0; i < arrN.length; i++) {

			System.out.print("Insert number of ");
			arrN[i] = new int[sc.nextInt()];

		}

		for (int i = 0; i < arrN.length; i++) {

			for (int j = 0; j < arrN[i].length; j++) {

				if (i % 2 == 0) {

					arrN[i][j] = rnd.nextInt(11);

				} else {
					arrN[i][j] = -10 + rnd.nextInt(10);
				}

			}
		}

		System.out.println(Arrays.deepToString(arrN));
		System.out.println(fun1(arrN));
		System.out.println(fun2());
		System.out.println(fun3(arrN));
		System.out.println(Arrays.deepToString(fun4(arrN)));

		sc.close();
	}

}
