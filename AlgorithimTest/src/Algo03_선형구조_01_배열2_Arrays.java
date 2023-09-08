import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_��������_01_�迭2_Arrays {

	public static void main(String[] args) {

		//ArraysŬ����
		
		//1.����Ʈ ���� 
		List<String> list = Arrays.asList("A","B");
		
		//2. ���ǰ����� ä���
		String[] name = {"A","B","C"};
		Arrays.fill(name, "x");
		System.out.println("2. ���ǰ����� ä��� "+Arrays.toString(name)); //[x,x,x]
		
		Arrays.fill(name, 0,2,"A");
		System.out.println("2. ���ǰ����� ä��� "+Arrays.toString(name)); //[A,A,x]
		
		//3. �迭�� ��
		int[] n = {1,2,3};
		int[] n2 = {1,2,3};
		System.out.println("3. �迭�� �� "+Arrays.equals(n,n2)); //true
		
		//4. ����
		Integer [] n3 = { 6,2,7,98,24};
		Arrays.sort(n3); //�������� �⺻
		Arrays.sort(n3, Comparator.reverseOrder()); //��������
		//Comparator.reverseOrder() ������ؼ� Ŭ����Ÿ���̾�� ��
		System.out.println("4. ���� "+Arrays.toString(n3)); //[2,6,7,24,98]
		
		//5. Ư�� ���� ��ġ �˻�
		int [] n4 = { 6,2,7,98,24};
		int idx = Arrays.binarySearch(n4, 98);
		System.out.println("5. Ư�� ���� ��ġ �˻� "+idx);//3
		
		//6. �迭 ũ�� ����
		int[] n5 = {1,2,3};
		n5 = Arrays.copyOf(n5, 5);
		System.out.println("6. �迭 ũ�� ���� "+Arrays.toString(n5));//[1, 2, 3, 0, 0]

		//7. �迭���� ��Ʈ�� ����
		int[] n6 = {1,2,3};
		Arrays.stream(n6).forEach(System.out::println);
		
		
		
		
	}
}
