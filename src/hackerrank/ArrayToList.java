package hackerrank;

import java.util.ArrayList;
//1 question
class InvalidStringExeption extends Exception {
	private static final long serialVersionUID = 1L;

	InvalidStringExeption() {
		super("This is invalid string: ");
	}
}
//2 question 
interface MyList {
	void convert(String[] a);
	void replace(int idx);
	ArrayList<String>compact();
}
class ArrayToList extends InvalidStringExeption implements MyList {

	private static final long serialVersionUID = 1L;
	ArrayList<String> arrayToString;
	ArrayToList(){
		super();
		arrayToString = new ArrayList<String>();
	}
	@Override
	public void convert(String[] a) {
		for(int i=0;i<a.length;i++) {
			arrayToString.add(a[i]);
			System.out.println("I have added string: " 
			+ arrayToString.get(i)+" at the index: "+i);	
			}
		}
	
	@Override
	public void replace(int idx) {
		System.out.println("I have replaced the string: " 
							+ arrayToString.get(idx)+" with null string");
		arrayToString.remove(idx);
		arrayToString.removeIf(null);
		arrayToString.add(idx, null);
	}
	
	@Override
	public ArrayList<String> compact() {
		System.out.println ("Loop is started ");
			for(int i=0;i<arrayToString.size();i++) {
				if(arrayToString.get(i).equals(null)) {
					arrayToString.remove(i);
				}
			}
		return arrayToString;
	}
}