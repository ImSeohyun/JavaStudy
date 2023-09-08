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

public class Algo03_선형구조_08_Queue {
	public static void main(String[] args) {

		/*
		 	Queue
		 	-FIFO (First In First Out)
		 	
		 	-enqueue
		 	 dequeue
		 	 
		 	삽입(enqueue)
		 	add(값) -> 저장시 문제 발생하면 예외 발생
		 	offer(값) -> 저장시 문제 발생되면 false 리턴
		 	   
		 	삭제 관련 메서드
		 	remove() -> 값이 없으면 예외 발생
		 	poll() -> 값 없으면 null 리턴
		 */
		
		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		
		System.out.println(q); //[A, B, C, D, E]
		System.out.println("peek: "+q.peek()); //가장 처음에 있는 값
		
		String str = q.remove();
		System.out.println(str+" "+q); //A [B, C, D, E]
		
		str = q.poll();
		System.out.println(str+" "+q); //B [C, D, E]
	
	}
}
