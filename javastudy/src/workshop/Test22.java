package workshop;

public class Test22 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			char str ='A';
			for(int j=1;j<=i;j++) {
				System.out.print(str);
				str++;
			}
			System.out.println();
		}
	}
}
