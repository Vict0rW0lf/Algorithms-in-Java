package algorithms.searching;

public class LinearSearch {

	private static boolean search(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) 
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 10, 88, 77, 100, 102, 122, 200};
		
		System.out.println(search(arr, 102));
		System.out.println(search(arr, 9));
		System.out.println(search(arr, 200));
	}

}
