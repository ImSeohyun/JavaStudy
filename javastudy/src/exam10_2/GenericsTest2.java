package exam10_2;

import java.util.Date;

//���ʸ��� ������
class Box2<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
	
}

public class GenericsTest2 {

	public static void main(String[] args) {
		
		//���ڿ��� ����
		Box2<String> b2 = new Box2();
		Box2<String> b1 = new Box2<String>();
		b1.setValue("ȫ�浿");
		//b1.setValue(10); //����1: ������ �ÿ� �߸��� ������ ���� ���� ����

		String str = b1.getValue(); //����2: ����ȯ ���ʿ�
		System.out.println("���ڿ� ����: "+str.length());
		
		//��¥�� ����
		Box2<Date> b3 = new Box2<Date>();
		b3.setValue(new Date());
		//b1.setValue(10); //����1: ������ �ÿ� �߸��� ������ ���� ���� ����
		Date d = (Date)b3.getValue(); //����2: ����ȯ ���ʿ�
		System.out.println("��¥: "+d.getYear());
	}
}
