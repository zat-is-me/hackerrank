package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		 //String manipulation ArrayToList al = new ArrayToList(); 
		String[] a = new String[] { "abcd" }; 
		al.convert(a); al.replace(0); al.compact();
		 
		int[] arr = new int[] { 2, 1, 4, 5, 3, 7, 6 }; 
		MinimumSwap.minimumSwaps(arr );
		
		int n = 9, // the size of the array
				d = 8; // number of element to be shifted
		int[] a = new int[n];
		// initializing array
		for (int i = 0; i < a.length; i++)
			a[i] = i + 1;
		LeftRotate.rotatArray(a, d);

		List<String> myListOne = new ArrayList<String>();
		List<String> myListTwo = new ArrayList<String>();

		myListOne.add("ccc");
		myListOne.add("aaa");
		myListOne.add("ddd");
		myListOne.add("aaa");
		myListOne.add("aaa");

		myListTwo.add("aaa");
		myListTwo.add("aaa");
		myListTwo.add("aaa");
		myListTwo.add("aaa");
		myListTwo.add("bbb");

		CommonString.commonString(myListOne, myListTwo);

	}

}
