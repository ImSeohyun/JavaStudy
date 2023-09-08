
public class Algo02_�Ǻ���ġ2_DP {

	//��ȭ��: f(n) =f(n-1)+f(n-2), f(1)=f(2)= 1
	/*
	 	DP(Dynamic Programming)
	 	- memoization�� Ȱ���Ͽ� ������ ����� �ݺ��� �� �����Ͽ� ���α׷����� ������ ���
	 	
	 */
	//�ܼ����
	static int num=0;
	private static int fibonacci2(int n) {
		num++;
		if(n<=1) {
			return n;
		}else {
			return fibonacci2(n-1)+fibonacci2(n-2); 
		}
	}
	
	//DP�� ����
	static int[] dp;
	
	private static int fibonacci(int n) {
		num++;
		if(n<=1) {
			return n;
		}else {
			if(dp[n]!=0)return dp[n];
			dp[n] = fibonacci(n-1)+fibonacci(n-2);
			return dp[n];
		}
	}
	
	public static void main(String[] args) {
		dp = new int[11];
		for(int i=1;i<=10;i++) {
			System.out.print(fibonacci2(i)+"  ");
		}
		System.out.println("num: "+num); //DP:28, �ܼ����:452
		
	}
}
