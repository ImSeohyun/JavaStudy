
public class Algo01_���丮�� {

	//��ȭ��: f(n) = n * f(n-1), f(1) = 1
	private static int factorial(int n) {
		System.out.println(n+ " ");
		if(n==1) {
			return 1;
		}else {
			return n* factorial(n-1); 
		}
	}
	
	public static void main(String[] args) {
		int x = factorial(5);
		System.out.println(x);
	}
}
