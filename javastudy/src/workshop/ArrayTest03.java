package workshop;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		int total = 0;
		int cnt =0;
		
		for(int[] i:arr2) {
			for(int j: i) {
				cnt++;
				total+=j;
			}
		}
		double average = total/20.0;
		
		System.out.println("total="+total);
		System.out.println("total="+ average);
		
	}
}
