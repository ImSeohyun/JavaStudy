package exam02;

public class PDT_DataType {

	public static void main(String[] args) {

		// 1. ���� ���ͷ� - char �⺻��
		System.out.println('A');
		System.out.println('ȫ');
		
		//���� ���ڿ� - String ������
		System.out.println("ȫ�浿");
		
		// 2. �̽������� ����
		System.out.println("ȫ��\n��");
		System.out.println("ȫ��\t��");
		System.out.println("ȫ��\'��");
		System.out.println("ȫ��\"��");
		System.out.println("ȫ��\\��");
		
		// 3. ���� ���ͷ�
		System.out.println(10); //10����
		
		System.out.println(0b01); //2����
		
		System.out.println(01); //8����
		
		System.out.println(0x0); //16����
		System.out.println(0xA); //16����
		System.out.println(0xF); //16����
		
		//4byte�� int �������: -2147483648 ~ +2147483647
		System.out.println(2147483647);
		//System.out.println(2147483648); out of range
		System.out.println(2147483648L); //4byte���� ū ������ L �������� long���� ó��
		
		// 4. �Ǽ� ���ͷ�
		System.out.println(3.14); //double
		System.out.println(3.14D); //double
		System.out.println(3.14d); //double

		System.out.println(3.14F); //float ó��
		System.out.println(3.14f); //float ó��
		System.out.println(3.14e3); //���� ǥ��
	}

}
