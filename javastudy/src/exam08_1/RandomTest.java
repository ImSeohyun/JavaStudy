package exam08_1;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		//������ ���
		Random r = new Random();
		
		//������ ���� -> seed ���� 
		r.setSeed(1234); //
		
		System.out.println("������ ������ "+ r.nextInt());
		
		System.out.println("������ ���� ���� ������ "+ r.nextInt(3));//0,1,2
		System.out.println("������ ���� ���� ������ "+ r.nextInt(10)+1);//1~10
		
		System.out.println("������ ���� "+ r.nextBoolean());
		
		System.out.println("������ �Ǽ��� double "+ r.nextDouble());
		System.out.println("������ �Ǽ��� float"+ r.nextFloat());
		
		
	}
}
