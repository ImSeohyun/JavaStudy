package exam03;

import java.util.Arrays;

public class ArrayTest10 {

	//�⺻�� ����
	public static void pdt(int n) {
		System.out.println("pdt: "+n);
		n =20;
	}
	
	//������ ����
	public static void rdt(int[] x) {
		System.out.println("rdt:"+x);
		System.out.println("rdt:"+Arrays.toString(x));
		
	}
	
	public static void main(String[] args) {
		
		//�⺻�� ������ (call by value�� ����. ���� ����Ǳ� ������ ������ ���� �ȵ�)
		int n=1;
		System.out.println("ȣ���� n��: "+n);
		pdt(n);
		System.out.println("ȣ���� n��: "+n); //n�� �������� 1��
		
		//������ ������
		int[] n2 = {1,2,3};
		System.out.println("ȣ���� n2��:"+Arrays.toString(n2));
		rdt(n2);
		
	}
	
}
