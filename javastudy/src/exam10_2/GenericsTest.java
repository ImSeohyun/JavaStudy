package exam10_2;

import java.util.Date;

//���ʸ��� ������
class Box{
	Object obj;
	
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
	
}

public class GenericsTest {

	public static void main(String[] args) {
		
		//���ڿ��� ����
		Box b1 = new Box();
		b1.setValue("ȫ�浿");
		//b1.setValue(10); //�̽�1: �߸��� ������ ���� ���� -> ���� �ÿ� ���� ���� ����
		String str = (String)b1.getValue(); //�̽�2: ������ ����ȯ�ؾ� �ȴ�
		System.out.println("���ڿ� ����: "+str.length());
		
		//��¥�� ����
		Box b2 = new Box();
		b2.setValue(new Date());
		//b1.setValue(10); //�̽�1: �߸��� ������ ���� ���� -> ���� �ÿ� ���� ���� ����
		Date d = (Date)b2.getValue(); //�̽�2: ������ ����ȯ�ؾ� �ȴ�
		System.out.println("��¥: "+d.getYear());
	}
}
