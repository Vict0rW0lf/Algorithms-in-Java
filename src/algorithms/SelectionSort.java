package algorithms;

public class SelectionSort {

	public static void main(String[] args) {

		Integer[] myIntArr = { 4, 67, 5, 7, 8, 22, 11, 22 };

		System.out.println("Before selection sort:");
		SortUtils.print(myIntArr);
		
		Integer[] sortedArr = selectionSort(myIntArr);

		System.out.println("After selection sort:");
		SortUtils.print(sortedArr);

	}

	public static Integer[] selectionSort(Integer[] arr) {

		/*
		 * This is a selection sort algorithm (one of the most simple ways to sort an
		 * array). We go through the entire array and find the lowest element and change
		 * it to the proper location.
		 * 
		 * Steps:
		 * Initialize variable with index number 
		 * Loop through array started from index + 1
		 * If number is smaller than current index value, replace index value with current number until the loop finishes
		 * Initialize variable with current index number
		 * Put the old value from arr[i] where the smaller number was found 
		 * Replace the current arr[i] position with the new small number
		 * All the aforementioned steps will repeat until the iteration through array finishes
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
