package exam08;

interface Flyer{
	public abstract void fly();
}

class Bird implements Flyer{

	@Override
	public void fly() {
		System.out.println("bird fly");
	}
	
}

public interface TestMain {
	public static void main(String[] args) {

		//1. �̸� ���� Ŭ���� ����� ���
		Flyer f = new Bird(); //������
		f.fly();
		
		//2. �͸� Ŭ���� ����� ���
		/*
		 *  �������̽��� ������ = new  �������̽���(){
		 *  	�߻�޼��� ������
		 *  };
		 */
		Flyer f2 = new Flyer() {

			@Override
			public void fly() {
				System.out.println("�͸� fly");
			}
			
		};
		f2.fly();
		
	}
	
}
