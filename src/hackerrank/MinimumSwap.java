package hackerrank;

import java.util.stream.IntStream;

public class MinimumSwap {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 2, 4, 6, 7 };
		System.out.println("\nMinimun swap: " + minimumSwaps(arr));
	}

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] array) {
		int counter = 0;
		int index = 0;
		int theNextMin = array[0];

		for (int i = 0; i < array.length; i++) {

			// Inorder to avoid the last array index
			if (i < array.length - 1) {
				theNextMin = array[i + 1];
				// Breaking down unsorted part of the array
				int[] subArray = new int[array.length - (i + 1)];
				for (int j = 0; j < subArray.length; j++) {
					subArray[j] = array[i + j + 1];
					// Looking the minimun value from unsorted part
					theNextMin = Math.min(theNextMin, subArray[j]);
				}
				// the index will help to separet between
				// the sorted and unsorted
				index = i;
				// check the positon of the array value is already sorted
				if (i + 1 != array[i]) {
					//find minimum value from unsorted part of the array
					int minIndex = findMinValueIndex(subArray, theNextMin);
					//swap the minimum value 
					mySwap(array, subArray, index, theNextMin,minIndex);
					counter++;
				}
			}
		}
		return counter;
	}

	public static int findMinValueIndex(int[] subArray, int theNextMin) {
// Java 7
/*		int minIndex = 0;
		int minValue = theNextMin;
		for (int i = 0; i < subArray.length; i++) {
			if (subArray[i] == minValue) {
				minIndex = i;
				break;
			}
		}
		return minIndex;*/

		//Java 8
		int minIndex;
        int minValue = theNextMin;
        
        minIndex = IntStream.range(0, subArray.length)
        		.filter(i -> subArray[i] == minValue)
        		.findFirst()
        		.orElse(0);
        return minIndex;
	}

	private static int[] mySwap(int[] array, int[] subArray, int index, int minValue, int minIndex) {
		//Java 7
/*		int temp = array[index];
		array[index] = subArray[minIndex];
		for (int i = (index + 1); i < array.length; i++) {
			if (minValue == array[i]) {
				array[i] = temp;
				break;
			}
		}*/
		
		//Java 8
		int temp = array[index];
        array[index] = subArray[minIndex];
        IntStream.range(index + 1, array.length)
                .filter(i -> minValue == array[i])
                .findFirst().ifPresent(i -> array[i] = temp);
		return array;
	}
}


















