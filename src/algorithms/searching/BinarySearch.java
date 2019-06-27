package algorithms.searching;

public class BinarySearch {
	
	private static boolean binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			
			if (key < arr[middle]) {
				end = middle - 1;
			} else if (key > arr[middle]) {
				start = middle + 1;
			} else if (key == arr[middle]) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 10, 22, 33, 45, 77, 88, 100};
		
		System.out.println(binarySearch(arr, 1));
		System.out.println(binarySearch(arr, 33));
		System.out.println(binarySearch(arr, 101));
	}

}
