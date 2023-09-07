package workshop07.shape;

public class Circle extends Shape implements Movable{

	private int radius;
	
	public Circle() {};
	
	public Circle(int radiusm, int x, int y) {
		Point p = new Point(x,y);
	}

	@Override
	public double getArea() {

		return 0;
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	
}
