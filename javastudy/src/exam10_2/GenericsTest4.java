package exam10_2;

import java.util.ArrayList;
import java.util.List;

//<? extends E>

class Person{}
class Man extends Person{}
class Woman extends Person{}


public class GenericsTest4 {
	public static void main(String[] args) {

		//man�� ����
		List<Man> list = new ArrayList<Man>();
		list.add(new Man());
		list.add(new Man());
		printData(list);
		printData2(list);
		
		//woman�� ����
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData(list2);
		//printData2(list2);//man�� �θ� ���� �� �����Ƿ� ����
		
		//String�� ����
		List<String> list3 = new ArrayList<String>();
		list3.add("ȫ�浿1");
		list3.add("ȫ�浿2");
		//printData(list3);
		//printData2(list3);//man�� �θ� ���� �� �����Ƿ� ����
		
		//Person�� ����
		List<Person> list4 = new ArrayList<Person>();
		list4.add(new Person());
		list4.add(new Person());
		printData(list4);
		printData2(list4);
		
	}
	
	//person �� �ڽĸ� �����ϵ��� ����
	public static void printData(List<? extends Person> xxx) {
		System.out.println(xxx);
	}
	//man �� �θ� �����ϵ��� ����
	public static void printData2(List<? super Man> xxx) {
		System.out.println(xxx);
	}
}
