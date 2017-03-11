package Arr6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Arr6 {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static int findMode(int[] arr) {

		List<Integer> mode = new ArrayList<>();

		int idx = 0, counter = 0, counterMax = 0, numberMax = 0;

		do {

			counter = 0;

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == arr[idx]) {

					counter++;

				}

			}
			if (counter > counterMax) {

				counterMax = counter;
				numberMax = arr[idx];

			}
			mode.add(counter);
			idx++;

		} while (arr.length > idx);

		for (int i = 0; i < mode.size(); i++) {

		}
		if (counterMax == 1) {

			return 0;
		}

		return numberMax;
	}

	public static double findMedian(int[] arr) {

		Arrays.sort(arr);

		if (arr.length % 2 == 0) {

			return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;

		}

		return (arr[(arr.length / 2)]);
	}

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] arr = new int[10 + rnd.nextInt(41)];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = 10 + rnd.nextInt(41);

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(findMedian(arr));
		System.out.println(findMode(arr));

	}

}
