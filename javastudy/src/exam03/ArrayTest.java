package exam03;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		//1���� �迭 ���
		
		int [] n = new int[] {10,20,30,40};
		
		//1. ���������� idx �̿�
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		//2. �Ϲ� for��
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		
		//3. for each�� (js�� for 0f�� ����)
		for(int k:n) {
			System.out.println(k);
		}
		
		//4. �迭 -> �ѹ��� ���ڿ��� ��� (java.util.Arrays Ŭ���� �̿�)
		//Arrays.toString(�迭��);
		System.out.println(Arrays.toString(n));//[10, 20, 30, 40]

		
	}
}
