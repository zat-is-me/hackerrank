package hackerrank;


import java.time.LocalDateTime;


public class MinSwap {

	static LocalDateTime myMin = LocalDateTime.now();
	
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        
        int temp;
        int counter =0;
        int []swap = new int[arr.length];
        int []revers = new int[arr.length];
        System.out.println("Befor swap: ");
        for(int i=0;i<arr.length;i++){
        	swap[i]=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=arr.length-1;i>=0;i--){
        	revers[i]=arr[i];
            System.out.print(arr[i]+" ");
        }
        
        //bring back to original 
        for(int i=1;i<arr.length;i++){
        	boolean loop=false;
        	int previous = arr[i-1];
			/*
			 * System.out.println("This is temp: " +temp[i]);
			 * System.out.println("This is next: " +next);
			 * System.out.println("This is arr: " +arr[i]);
			 */
            if(previous > arr[i]){
            	temp  = arr[i-1];
                arr[i-1] = swap[i];
                arr[i] = temp;
                counter++;
            }
            else {
            	loop = true;
            }
            if(loop)
            	break;
        }
        System.out.println("\nAfter swap the array is: ");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println("\nminumum swap is: "+ counter);
        //determine the step
		return counter;
    }

}
