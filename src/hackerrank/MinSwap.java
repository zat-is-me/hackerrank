package hackerrank;

public class MinSwap {

	

	public static void main(String[] args) {
		int[] arr = new int[] {1 ,3, 5, 2 ,4 ,6, 7};
		System.out.println("\nMinimun swap: " + minimumSwaps(arr));
	}

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] array) {
		int counter = 0;
		int index = 0;
		int minSub =array[0];
		int minIndex = minSub;

		
		//Take first value array
		for (int i = 0; i < array.length; i++) {
			if(i< array.length-1) {
				minSub = array[i+1];
			int[] subArray = new int[array.length-(i+1)];
			
			for (int j =0; j < subArray.length; j++) {
				subArray[j] = array[i+j+1];
				minSub = Math.min(minSub,subArray[j]);
			}
				//the next index 
				index =i;
				if(i+1 != array[i]) {				
					findMinValueIndex(array,subArray,index,minSub);
					counter++;
				}
			}
		}
		
		//cut the array
		
		//find minimum value index then swap it with array 
		
		
		System.out.println("\nAfter swap the array is: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return counter;
	}

	public static void findMinValueIndex(int[]array,int[]subArray,int index ,int minSub) {

		int minIndex = 0;
		int minValue = minSub;
	
		for (int i = 0; i <subArray.length; i++) {
			//System.out.print(" "+subArray[i]);
			if(subArray[i] == minValue) {
				minIndex = i;
				break;
			}
		}
		mySwap(array,subArray,index,minValue,minIndex);
	}
	
	private static int[] mySwap(
			int[]array,int[]subArray,int index,int minValue, int minIndex) {
		
			int temp = array[index]; 
			array[index] = subArray[minIndex];
			for (int i = (index+1); i < array.length; i++) {
				if(minValue == array[i]) {
					array[i] = temp;
					break;
				}
			}				
		return array;
	}

}
