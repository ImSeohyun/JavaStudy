package exam07;

public class TestPet2 {

	public static void main(String[] args) {
		
		//������ Ȱ��
		
		//1. �迭
		Pet [] pets = {new Cat("�߿���1", 2),
			       new Dog("��ġ1", 1, "����"),
			       new Dog("��ġ2", 2, "����"),
			       new Cat("�߿���2", 1),
			       new Bird("��ġ", 1, "��"),
			       new Cat("�߿���3", 4) };
		//�̸��� ���̸� ���
		for(Pet p: pets) {
			System.out.printf("�̸�: %s, age:%d \n", p.getName(),p.getAge());
		}
		System.out.println();

		//����̸� ��� -> �迭���� ������ �� ������ �ĺ��ϴ� ��� �ʿ�(���� instanceof Ÿ�� ������)
		for(Pet p : pets) {
			if(p instanceof Cat) {
				System.out.printf("�̸�: %s, age:%d \n", p.getName(),p.getAge());
			}
		}
		
		//������ �̸�,����,���� ���
		for(Pet p : pets) {
			if(p instanceof Dog) {
				
				//pet Ÿ�� -> dog Ÿ��
				Dog d = (Dog)p;
				System.out.printf("�̸�: %s, age:%d sex:%s \n", 
						d.getName(),d.getAge(),d.getSex());
				//petŬ�������� getsex�� ���� ������ ����ȯ�� �������
			}
		}
		
	}
}
