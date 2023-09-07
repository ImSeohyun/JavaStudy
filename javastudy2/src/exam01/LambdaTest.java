package exam01;


@FunctionalInterface
interface Flyer {
	//1. �Ķ���� x, ���ϰ� x
	public void fly();
}

public class LambdaTest {
	public static void main(String[] args) {
		
		//�͸� Ŭ����
		/*
		  �������̽��� ������ = new �������̽���(){
		  		//�߻�޼��� ������
		  };
		 */
		
		Flyer f = new Flyer() {
			
			@Override
			public void fly() {
				System.out.println("flyer() fly");
			}
		};
		f.fly();
		
		//���� ǥ����
		Flyer f2 = () -> {System.out.println("����ǥ���� flyer() fly");};
		f2.fly();
		
	}
}
