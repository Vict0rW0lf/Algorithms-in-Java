package algorithms;

 /**
  *
  *	Insertion sort is not a fast algorithm because it uses
  * nested loops to shift items into place  
  * 
  * It's useful only for small data sets
  * 
  */

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Integer[] myIntArr = { 4, 67, 5, 7, 8, 22, 11, 22 };

		System.out.println("Before insertion sort:");
		SortUtils.print(myIntArr);

		Integer[] sortedArr = insertionSort(myIntArr);

		System.out.println("After insertion sort:");
        SortUtils.print(sortedArr);
	}
	
	public static Integer[] insertionSort(Integer[] arr) {
		// It starts at one so it doesn't throw an index out of bounds exception 
		for (int i = 1; i < arr.length; i++) {
			// we initialize the hold variable to keep the value of the current cell safe
			int hold = arr[i];
			// the variable j that will work to check and move variables to be sorted
			int j = i;
			
			
			while (j > 0 && arr[j - 1] > hold) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = hold;
		}
		
		return arr;
	}

}
