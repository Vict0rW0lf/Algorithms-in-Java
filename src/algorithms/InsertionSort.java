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
		
		int[] myIntArr = { 4, 67, 5, 7, 8, 22, 11, 22 };

		System.out.println("Before insertion sort:");
		for (int i : myIntArr) {
			System.out.print(i + " ");
		}

		System.out.println();

		int[] sortedArr = insertionSort(myIntArr);

		System.out.println("After insertion sort:");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}  
        
	}
	
	public static int[] insertionSort(int[] arr) {
		
		return arr;
	}

}
