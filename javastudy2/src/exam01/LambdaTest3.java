package exam01;


@FunctionalInterface
interface Flyer3 {
	//2. �Ķ���� 2��, ���ϰ� x
	public void fly(int n, int n2);
}

public class LambdaTest3 {
	public static void main(String[] args) {

		Flyer3 f = new Flyer3() {
			
			@Override
			public void fly(int n,int n2) {
				System.out.println("Flyer3 fly(int n, int n2)"+n+"\t"+n2);
			}
		};
		f.fly(10,1);
		
		//���� ǥ����
		Flyer3 f2 = (int n, int n2) -> {
			System.out.println("����Flyer3 fly(int n, int n2)"+n+"\t"+n2);
		};
		Flyer3 f3 = (n, n2) -> {
			System.out.println("����Flyer3 fly(int n, int n2)"+n+"\t"+n2);
		};
		f2.fly(20,10);
		f3.fly(220,10);
		
	}
}
