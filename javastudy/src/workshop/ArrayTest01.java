package workshop;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int sum = 0;
		int avg = 0; 
		
		for(int i: arr) sum+=i;
		
		System.out.println("sum="+sum);
		System.out.println("avg="+(sum/5));
	}
}
