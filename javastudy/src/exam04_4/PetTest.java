package exam04_4;

public class PetTest {

	public static void main(String[] args) {
		
		Cat c = new Cat("�߿�",2,"f");
		
		System.out.println(c.getAge());
		System.out.println(c.getName());
		System.out.println(c.getSex());
		
		c.setAgeSex(1, "f");
		System.out.println(c.getAge());
		 
		//getCat ȣ��
		String result = c.getCat("����", 1, "����");
		System.out.println(result);
		
		////////////
		c.xxx();
		
		c.yyy(10); 
	}
}
