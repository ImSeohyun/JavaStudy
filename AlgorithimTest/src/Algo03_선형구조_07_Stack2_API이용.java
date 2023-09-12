import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class Algo03_��������_07_Stack2_API�̿� {
	public static void main(String[] args) {

		Stack<Integer> x = new Stack<>();

		x.push(5);
		x.push(4);
		x.push(3);
		x.push(2);
		x.push(1);

		System.out.println(x); // [5, 4, 3, 2, 1]

		// ���� �����ϰ� ���ŵ� ���� ��ȯ
		int n = x.pop();
		System.out.println(n + " " + x);// 1 [5, 4, 3, 2]
		
		// Looks at the object at the top of this stack
		System.out.println("top��(���ÿ��� ���� �ֻ�����)" + x.peek());
	}
}
