package workshop07;

import java.util.ArrayList;

public class ConvertList {

	public ArrayList<Integer> convertList(int[] arr){
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			a.add(arr[i]);
		}
		return a;
	}
}
