import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAnyMatchMethod {

		public static void main(String[] args) {
			int arr[]= {1,2,3,4,4,55,6,7,8,9,15,5};
			int valueInQuestion=5;
			
			System.out.println(Arrays.toString(arr));
			find(arr,valueInQuestion);
		}

		private static void find(int[] arr, int valueInQuestion) {
			boolean isIt = IntStream.of(arr) .anyMatch(x -> x == valueInQuestion); 
			
			System.out.println("the value "+ valueInQuestion+ " is in the array: " +isIt);

			
		}

	}