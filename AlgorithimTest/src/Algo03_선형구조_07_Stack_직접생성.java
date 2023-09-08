import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

class MyStack{
	int top; //������ �ֻ��
	int size;
	int[] stack;
	
	public MyStack(int size) {
		this.size = size;
		stack = new int[size];
		top=-1;
	}
	
	//����: top �����ϰ� �� ����
	public void push(int n) {
		++top;
		stack[top]=n;
		System.out.println(stack[top]+" Push~");
	}
	//����: �������ϰ� top ����
	public void pop() {
		stack[top--]=0;
		if(top>=0)System.out.println(stack[top]+" pop~");
	}
	//���� top�� �ִ� �� ��ȯ (������ �ֻ��)
	public int peek() {
		return stack[top];
	}
}
public class Algo03_��������_07_Stack_�������� {
	public static void main(String[] args) {

		MyStack x = new MyStack(5);
		x.push(5);
		x.push(4);
		x.push(3);
		x.push(2);
		x.push(1);
		
		System.out.println(Arrays.toString(x.stack));
		System.out.println(x.peek());
		
		for(int i=0; i<x.size;i++) {
			x.pop();
			
		}
	
	}
}
