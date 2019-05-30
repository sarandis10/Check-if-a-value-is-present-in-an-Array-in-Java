import java.util.Arrays;

public class ListContainsMethod {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,55,6,7,8,9,15};
		int valueInQuestion=5;
		
		System.out.println(Arrays.toString(arr));
		find(arr,valueInQuestion);
	}

	private static void find(int[] arr, int valueInQuestion) {
		boolean isIt = Arrays.asList(arr).contains(valueInQuestion);
		
		System.out.println("the value "+ valueInQuestion+ " is in the array: " +isIt);

		
	}

}
