package hackerrank;

import java.util.List;

public class CommonChar {
	static void commonString(List<String> a, List<String> b) {
		//This algorithm works any size of two equal size array and word length
		for( int i=0;i<a.size();i++) {
			boolean found = false;
			//If both string have the same word at index i
			if(a.get(i).contains(b.get(i))) 
				found = true;
			//Check any common character at the index of i
			else {
					for(int j=0;j<a.get(i).length();j++) {
						//Check one character at a time 
						for(int k =0;k<b.get(i).length();k++) {
							if(a.get(i).charAt(j) == b.get(i).charAt(k)) {
									found = true;
									//If found break the inner for loop 
									break;
								}
							}
							//If found break the middle for loop 
							if(found) 
								break;
						}
				}
				if(found)
					System.out.println("YES");
				else
					System.out.println("NO");
			}				
	}

}
