import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,55,6,7,8,9};
		int valueInQuestion=5;
		
		System.out.println(Arrays.toString(arr));
		find(arr,valueInQuestion);
	}

	private static void find(int[] arr, int valueInQuestion) {
		Arrays.sort(arr);
		int xx=Arrays.binarySearch(arr, valueInQuestion);
		boolean itIs=xx>0? true:false;
		System.out.println("the value "+ valueInQuestion+ " is in the array: " +itIs);

	}

}
