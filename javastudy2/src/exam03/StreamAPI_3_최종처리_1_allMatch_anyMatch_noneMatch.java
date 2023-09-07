package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamAPI_3_����ó��_1_allMatch_anyMatch_noneMatch {
	public static void main(String[] args) {
		/*
		 * ����ó�� �ܰ迡�� ��ҵ��� Ư�� ���ǿ� �������� Ȯ��
		 * 
		 * 1.allMatch(Predicate): ��� ��ҵ��� Predicate ���ǿ� ��ġ�ϴ��� üũ
		 * 2.anyMatch(Predicate): �Ϻκ��� ��ҵ��� Predicate ���ǿ� ��ġ�ϴ��� üũ
		 * 3.noneMatch(Predicate): ��� ��ҵ��� Predicate ���ǿ� ��ġ���� �ʴ��� üũ
		 * 
		 * => ���� ����� boolean ������ ��ȯ
		 */

		int[] arr = {1,2,3,4,5};
		
		//1. allMatch
		//�͸�Ŭ����
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int t) {
				return t <10;
			}
		}; 
		//��� ��Ұ� 10���� ������
		boolean result = Arrays.stream(arr)
							   .allMatch(predicate);
		System.out.println("��� ��Ұ� 10���� ������? "+result );
		
		//����
		System.out.println(Arrays.stream(arr)
								 .allMatch(t->t<10));
		System.out.println();
		
		//2. anyMatch
		//��� �߿��� 3�� ����� �ִ°�
		boolean result2 = Arrays.stream(arr)
								.anyMatch(t->t%3==0);
		System.out.println("��� �߿��� 3�� ����� �ִ°�? "+result2 );
		System.out.println();

		//3. noneMatch
		//��� ��� �߿��� 3�� ����� ���°�
		boolean result3 = Arrays.stream(arr)
				.noneMatch(t->t%3==0);
		System.out.println("��� ��� �߿��� 3�� ����� ���°�? "+result3);
		
		
	}
}
