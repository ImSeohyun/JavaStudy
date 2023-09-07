package school2;

import school2.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray [] = new Student[3];
		
		Student s1 = new Student("È«±æµ¿",15,170,80);
		Student s2 = new Student("ÇÑ»ç¶÷",13,180,70);
		Student s3 = new Student("ÀÓ°ÆÁ¤",16,175,65);
		
		studentArray[0] = s1;
		studentArray[1] = s2;
		studentArray[2] = s3;
		
		System.out.println("ÀÌ¸§       ³ªÀÌ         ½ÅÀå       ¸ö¹«°Ô");
		double age =0.0;
		double height =0.0;
		double weight =0.0;
		for(int i=0;i<studentArray.length;i++) {
			System.out.println(studentArray[i].studentInfo());
			age += studentArray[i].getAge();
			height += studentArray[i].getHeight();
			weight += studentArray[i].getWeight();
		}
		System.out.println();
		System.out.println("³ªÀÌÀÇ Æò±Õ: "+Math.round(age/3.0*1000)/ 1000.0);
		System.out.println("½ÅÀåÀÇ Æò±Õ: "+Math.round(height/3.0*1000)/ 1000.0);
		System.out.println("¸ö¹«°ÔÀÇ Æò±Õ: "+Math.round(weight/3.0*1000)/ 1000.0);
		System.out.println();
		
//		String[] agemax = new String[2];
//		agemax[0] = s1.getName();
//		agemax[1] = Integer.toString(s1.getAge());
//		if(Integer.valueOf(agemax[1])<s2.getAge()) {
//			agemax[0] = s2.getName();
//			agemax[1] = Integer.toString(s2.getAge());
//		}
//		if(Integer.valueOf(agemax[1])<s3.getAge()) {
//			agemax[0] = s3.getName();
//			agemax[1] = Integer.toString(s3.getAge());
//		}
		
		
		
		Student[] ageArr = studentArray.clone();
		
		Student[] hArr = studentArray.clone();
		
		Student[] wArr = studentArray.clone();

			

		
	}
}
