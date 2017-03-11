package Arr4;
import java.util.Arrays;
import java.util.Random;

public class Arr4 {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = 1 + rnd.nextInt(10);

		}

		int max = arr[0], counter = 0;

		int[] arrCoppy = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			arrCoppy[i] = arr[i];

		}

		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {

			if (arrCoppy[i - 1] > max) {

				max = arrCoppy[i];

			}

			arr[i] += arrCoppy[i - 1];

		}

		for (int i = 1; i < arr.length - 1; i++) {

			if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) {

				counter++;

			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrCoppy));
		System.out.println("Amount of elements which are smaller than previous and next element: " + counter);
	}

}
