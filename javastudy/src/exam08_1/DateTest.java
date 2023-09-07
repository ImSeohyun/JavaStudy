package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception{
		
		//��¥ ������
		Date d = new Date();
		
		System.out.println(d); //d.toString() ����, �����ǵ�
		//d.toString() �ߴµ� @Ŭ���� 16���� �� ������ Object�� �޼���
		
		// java.text.SimpleDateFormat Ŭ������ �����ؼ� ����Ѵ�.
				// ��. Date Ÿ�� -----> String
				// Fri Jul 21 15:23:12 KST 2023 =====> Ư�������� ���� ���ڿ��� ����
				/*
				 *   ��¥ ����
				 *   �⵵ : yyyy
				 *   ��:   MM
				 *   ��:   dd
				 *   �ð�: HH
				 *   ��:   mm
				 *   ��:   ss
				 */	
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		String result = sdf.format(d);
		System.out.println(result);
		
		//��. String -> Date
		String s = "2023��07��21��";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��");
		Date d2 = sdf2.parse(s);
		System.out.println(d2);
	
	}
}
