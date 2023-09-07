package exam01;


@FunctionalInterface
interface Flyer2 {
	//2. �Ķ���� ��, ���ϰ� x
	public void fly(int n);
}

public class LambdaTest2 {
	public static void main(String[] args) {
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int n) {
				System.out.println("flyer2 fly(int n)"+n);
			}
		};
		f.fly(10);
		
		//���� ǥ����
		Flyer2 f2 = (int n) -> {
			System.out.println("����flyer2 fly(int n)"+n);
		};
		f2.fly(20);
		
		//������Ÿ�� ����
		Flyer2 f3 =(n)-> {
			System.out.println("���� flyer2 fly(int n)"+n);
		};
		f3.fly(10);

		//�Ű����� �ϳ��� ()���� ����
		Flyer2 f4 = n-> {
			System.out.println("���� flyer2 fly(int n)"+n);
		};
		f3.fly(10);
		
	}
}
