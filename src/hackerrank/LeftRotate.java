package hackerrank;

public class LeftRotate {

	static int[] rotatArray(int[] a, int d) {
		int[] b =new int[a.length];
        //Checking the rotator input
        if(d>=0&&d<=a.length){
            //looping to pull the elements to back index
                for (int i = d; i < a.length; i++) {
                        b[i - d] = a[i];
                }
            //looping to push the elements to front index
                for(int i=0;i<d;i++){
                    b[(i+(a.length-d))] = a[i];
                }
           //Printing out result      
                for (int i = 0; i < a.length; i++) {
        			System.out.println(a[i] +" -> " +b[i]);
        		}
             }
        else {
        	System.out.println(d+" :Is not avalid rotator. it must be >= 0 or <= Array length");
        }
		
		return b;
	}

}
