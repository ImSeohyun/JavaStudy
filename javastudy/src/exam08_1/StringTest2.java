package exam08_1;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		String s = "Hello";
		//String Ŭ������ �ν��Ͻ� �޼���
		System.out.println("1. ���ڿ� ����:"+s.length());
		
		char c = s.charAt(1);
		System.out.println("2. Ư�� ���� ���:"+c);
		System.out.println("2. Ư�� ���� ���:"+s.charAt(1));

		System.out.println("3. Ư�� ���� ��ġ:"+s.indexOf('e'));
		System.out.println("3. Ư�� ���� ��ġ:"+s.indexOf('x'));//������ -1 
		
		System.out.println("4. �빮��: "+s.toUpperCase());
		System.out.println("5. �ҹ���: "+s.toLowerCase());
		
		System.out.println("6. ���ڿ� ����: "+s.concat("~~~"));

		System.out.println("7. �κп�: "+s.substring(1));//1���� ������
		System.out.println("7. �κп�: "+s.substring(1,4 ));//1~3����

		System.out.println("8. ���ڿ� ���� ����: "+s.contains("e"));
		System.out.println("8. ���ڿ� ���� ����: "+s.contains("X"));
		
		System.out.println("9. ���ڿ� ġȯ: "+s.replace("e", "X"));
		
		System.out.println("10. ���ڿ� ��: "+s.equals("Hello"));
		System.out.println("10. ���ڿ� ��: "+s.equals("hello"));
		System.out.println("10. ���ڿ� ��(��ҹ��� ����): "+s.equalsIgnoreCase("hello"));

		String s2 = "            world        ";
		System.out.println("11. ��������: "+s.trim());
		System.out.println("11. ��������: "+s.trim().length());
		
		//�����ڷ� �и� -> �迭�� ��ȯ
		String s3 = "AAA/BBB/CCC";
		String[] arr = s3.split("/");
		System.out.println("12. �����ڷ� �и�: "+Arrays.toString(arr));
		
		////////String�� static �޼��� -> String.�޼����
		System.out.println("13. ���� ����: ");
		System.out.println(String.format("�̸�:%s, age:%d", "hong",20));
		
		System.out.println("14.���ڿ��� ����"+String.valueOf(10));
		System.out.println("14.���ڿ��� ����"+String.valueOf(3.14));
		System.out.println("14.���ڿ��� ����"+String.valueOf(new char[] {'A','B'}));
		
		//���� ���ڿ� -> String ���ڿ��� ������� �ʴ´�. ���ο� ���ڿ��� ������ ��
		System.out.println(s);

	}
}