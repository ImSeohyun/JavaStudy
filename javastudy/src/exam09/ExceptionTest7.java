package exam09;

import java.io.IOException;

class Parent{
	public void a() throws RuntimeException{}
	public void b() throws RuntimeException{}
}
class Child extends Parent{
	//�����Ǵ� ���ų� ��� �� ���� �迭�� ����ϴ� ���·� ���
	public void a() {		}
	public void b() throws ArithmeticException {		}
	//public void c() throws IOException{}
}

public class ExceptionTest7 {

	public static void main(String[] args) {
	
	
	}
}
