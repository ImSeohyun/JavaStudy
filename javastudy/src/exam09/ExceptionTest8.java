package exam09;

import java.util.Random;

class MyRandom{
	
	public void rand() throws RuntimeException {
		
		Random r = new Random();
		int n = r.nextInt(3); // 0~2 ���� ���� ��ȯ
		//����. 0 ������ �ý��ۿ� �ҷ��� ���� �� ����
		if(n==0) throw new RuntimeException("������ 0 ���");
		System.out.println(n);
	}
}

public class ExceptionTest8 {

	public static void main(String[] args) {
	
		MyRandom x = new MyRandom();
		try {
		x.rand();
		}catch(RuntimeException e) {
			System.out.println("error �߻�."+e.getMessage());
		}catch(Exception e) {
			System.out.println("error �߻�.");
		
		}
		System.out.println("end");
		
	}
}
