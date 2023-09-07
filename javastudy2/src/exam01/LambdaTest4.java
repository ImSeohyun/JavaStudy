package exam01;


@FunctionalInterface
interface Flyer4 {
	//2. �Ķ���� o, ���ϰ� o
	public int fly(int n, int n2);
}

public class LambdaTest4 {
	public static void main(String[] args) {

		Flyer4 f = new Flyer4() {
			@Override
			public int fly(int n,int n2) {
				return n+n2;
			}
		};
		System.out.println("result " + f.fly(1, 2));
		
		//���� ǥ����
		Flyer4 f2 = (int n, int n2) -> {
			return n+n2;
		};
		Flyer4 f3 = (n, n2) -> {
			return n+n2;
		};
		//return ���常 ������ {}�� return Ű���� ����
		Flyer4 f4 = (n, n2)->n+n2;
		System.out.println("result " + f2.fly(10, 2));
	}
}
