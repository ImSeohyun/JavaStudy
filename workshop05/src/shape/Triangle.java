package shape;

public class Triangle extends Shape implements Resize{

	public Triangle() {}
	
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return (double)getHeight()*getWidth()/2;
	}

	@Override
	public void setResize(int size) {
		int update =getHeight()+size;
		setHeight(update);
	}
	
	
}
