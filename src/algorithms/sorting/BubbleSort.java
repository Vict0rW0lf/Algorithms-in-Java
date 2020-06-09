package algorithms.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] myIntArr = { 4, 67, 5, 7, 8, 22, 11, 22 };

		SortUtils.print("Before insertion sort:");
		SortUtils.print(myIntArr);

		Integer[] sortedArr = bubbleSort(myIntArr);

		SortUtils.print("After insertion sort:");
        SortUtils.print(sortedArr);
	}
	
	public static Integer[] bubbleSort(Integer[] arr) {
		boolean isSorted = false;
		int lastUnsorted = arr.length - 1;
		
		while (!isSorted) {
			isSorted = true;
			
			for (int i = 0; i < lastUnsorted; i++) {
				if ( arr[i] > arr[i + 1] ) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
		
		return arr;
	}

}
