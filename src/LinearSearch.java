import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,55,6,7,8,9};
		int valueInQuestion=5;
		
		System.out.println(Arrays.toString(arr));
		find(arr,valueInQuestion);
	}

	private static void find(int[] arr, int valueInQuestion ) {
		boolean itIs=false;
		for(int i:arr) {
			if(i==valueInQuestion) {
				itIs=true;
				break;
			}
		}
		System.out.println("the value "+ valueInQuestion+ " is in the array: " +itIs);
	}

}
