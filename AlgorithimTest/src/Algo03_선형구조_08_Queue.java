import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

import javax.management.Query;

public class Algo03_��������_08_Queue {
	public static void main(String[] args) {

		/*
		 	Queue
		 	-FIFO (First In First Out)
		 	
		 	-enqueue
		 	 dequeue
		 	 
		 	����(enqueue)
		 	add(��) -> ����� ���� �߻��ϸ� ���� �߻�
		 	offer(��) -> ����� ���� �߻��Ǹ� false ����
		 	   
		 	���� ���� �޼���
		 	remove() -> ���� ������ ���� �߻�
		 	poll() -> �� ������ null ����
		 */
		
		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		
		System.out.println(q); //[A, B, C, D, E]
		System.out.println("peek: "+q.peek()); //���� ó���� �ִ� ��
		
		String str = q.remove();
		System.out.println(str+" "+q); //A [B, C, D, E]
		
		str = q.poll();
		System.out.println(str+" "+q); //B [C, D, E]
	
	}
}
