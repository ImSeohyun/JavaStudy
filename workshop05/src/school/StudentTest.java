package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		
		//1. new �̿�
		studentArray[0] = new Student("ȫ�浿",15,171,81);
		studentArray[1] = new Student("�ѻ��",13,183,72);
		studentArray[2] = new Student("�Ӱ���",16,175,65);
		
		//2. ���ͷ� ���
		Student[] studentArray2 = {new Student("ȫ�浿",15,171,81),
									new Student("�ѻ��",13,183,72),
									new Student("�Ӱ���",16,175,65)
									};
		//3. new+ ���ͷ�
		Student[] studentArray3 = new Student[]{new Student("ȫ�浿",15,171,81),
			new Student("�ѻ��",13,183,72),
			new Student("�Ӱ���",16,175,65)
			};
		
		System.out.println("�̸�       ����         ����       ������");
		double age =0.0;
		double height =0.0;
		double weight =0.0;
//		for(int i=0;i<studentArray.length;i++) {
//			System.out.println(studentArray[i].getName()+"   "+studentArray[i].getAge()+"    "+studentArray[i].getHeight()+"   "+studentArray[i].getWeight());
//			age += studentArray[i].getAge();
//			height += studentArray[i].getHeight();
//			weight += studentArray[i].getWeight();
//		}
		for(Student stu: studentArray) {
			System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getHeight()+"\t"+stu.getWeight());
			age += stu.getAge();
			height += stu.getHeight();
			weight += stu.getWeight();
		}
		
		System.out.println("������ ���: "+Math.round(age/3.0*100)/ 100.0);
		System.out.printf("������ ���:%.2f \n",age/3);
		
		System.out.println("������ ���: "+Math.round(height/3.0*100)/ 100.0);
		System.out.printf("������ ���:%.2f \n",height/3);

		System.out.println("�������� ���: "+Math.round(weight/3.0*100)/ 100.0);
		System.out.println(String.format("�������� ���:%.2f \n",weight/3));
	}
}
