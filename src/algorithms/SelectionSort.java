package algorithms;

public class SelectionSort {

	public static void main(String[] args) {

		int[] myIntArr = { 4, 67, 5, 7, 8, 22, 11, 22 };

		System.out.println("Before selection sort:");
		for (int i : myIntArr) {
			System.out.print(i + " ");
		}

		System.out.println();

		int[] sortedArr = selectionSort(myIntArr);

		System.out.println("After selection sort:");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}

	}

	public static int[] selectionSort(int[] arr) {

		/*
		 * This is a selection sort algorithm (one of the most simple ways to sort an
		 * array). We go through the entire array and find the lowest element and change
		 * it to the proper location.
		 * 
		 * Step 1 - Set MIN to location 0 Step 2 - Search the minimum element in the
		 * list Step 3 - Swap with value at location MIN Step 4 - Increment MIN to point
		 * to next element Step 5 - Repeat until list is sorted
		 */

		for (int i = 0; i < arr.length; i++) {

			int index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

		return arr;
	}
}
