package shape;

import java.io.ObjectInputStream.GetField;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7,5,"blue");
		shape[1] = new Rectangle(4,6,"blue");
		shape[2] = new Triangle(6,7,"red");
		shape[3] = new Rectangle(8,3,"red");
		shape[4] = new Triangle(9,8,"white");
		shape[5] = new Rectangle(5,7,"white");
		
		System.out.println("�⺻ ����");
		for(Shape s: shape) {
			String shapeName="";
			if(s instanceof Triangle) {
				shapeName = "Triangle";
			}else {
				shapeName="Rectangle";
			}
			System.out.println(shapeName+"\t"+s.getArea()+"\t"+s.getColors());
		}
		
		System.out.println("������ ���� �� ����");
		for(Shape s : shape) {
			//triangle -> resize ���氡��
			//rectangle -> resize ���氡��
			Resize r = (Resize)s;
			r.setResize(5);
			String shapeName="";
			if(s instanceof Triangle) {
				shapeName = "Triangle";
			}else {
				shapeName="Rectangle";
			}
			System.out.println(shapeName+"\t"+s.getArea()+"\t"+s.getColors());
		}
	}
}
