package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		
		//1. new ÀÌ¿ë
		studentArray[0] = new Student("È«±æµ¿",15,171,81);
		studentArray[1] = new Student("ÇÑ»ç¶÷",13,183,72);
		studentArray[2] = new Student("ÀÓ°ÆÁ¤",16,175,65);
		
		//2. ¸®ÅÍ·² ¹æ¹ı
		Student[] studentArray2 = {new Student("È«±æµ¿",15,171,81),
									new Student("ÇÑ»ç¶÷",13,183,72),
									new Student("ÀÓ°ÆÁ¤",16,175,65)
									};
		//3. new+ ¸®ÅÍ·²
		Student[] studentArray3 = new Student[]{new Student("È«±æµ¿",15,171,81),
			new Student("ÇÑ»ç¶÷",13,183,72),
			new Student("ÀÓ°ÆÁ¤",16,175,65)
			};
		
		System.out.println("ÀÌ¸§       ³ªÀÌ         ½ÅÀå       ¸ö¹«°Ô");
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
		
		System.out.println("³ªÀÌÀÇ Æò±Õ: "+Math.round(age/3.0*100)/ 100.0);
		System.out.printf("³ªÀÌÀÇ Æò±Õ:%.2f \n",age/3);
		
		System.out.println("½ÅÀåÀÇ Æò±Õ: "+Math.round(height/3.0*100)/ 100.0);
		System.out.printf("½ÅÀåÀÇ Æò±Õ:%.2f \n",height/3);

		System.out.println("¸ö¹«°ÔÀÇ Æò±Õ: "+Math.round(weight/3.0*100)/ 100.0);
		System.out.println(String.format("¸ö¹«°ÔÀÇ Æò±Õ:%.2f \n",weight/3));
	}
}
