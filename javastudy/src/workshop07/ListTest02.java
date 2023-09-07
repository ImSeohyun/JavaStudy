package workshop07;

import java.util.ArrayList;

public class ListTest02 {

	public static void main(String[] args) {
		
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		
		ConvertList c = new ConvertList();
		
		ArrayList<Integer> a = c.convertList(array);
		
		for(int i : a) {
			System.out.println(i);
		}
		
	}
}
