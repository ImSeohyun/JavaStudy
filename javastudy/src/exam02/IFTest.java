package exam02;

import java.util.Scanner;

public class IFTest {

	public static void main(String[] args) {
		
		//1. ���� if��
		System.out.println("1");
		if(false)System.out.println("2");
		System.out.println("3");
		System.out.println("end");
		
		//Ű���� �Է� ó�� Ŭ����: Scanner Ŭ����
		//��ü���� ����: Ŭ������ ������ = new Ŭ������([��]);
		System.out.println("���� �Է��Ͻÿ�");
		Scanner scan = new Scanner(System.in); //System.in�� Ű���带 ����Ŵ
		int num = scan.nextInt(); //js�� prompt ����
		System.out.println(num);
		
		//���� �Է¹ް� ¦���� ��쿡�� �� �⤩��
		if(num%2==0) {
			System.out.println(num);
		}
	}
}
