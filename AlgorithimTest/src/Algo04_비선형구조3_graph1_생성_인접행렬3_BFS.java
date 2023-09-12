import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.sql.rowset.serial.SerialArray;

/*
             1
           2   3
         4  5    6    
        7         8 
         
      �����迭
      
        1 2 3 4 5 6 7 8
      1 0 1 1 0 0 0 0 0 
      2 1 0 0 1 1 0 0 0
      3 1 0 0 0 0 1 0 0 
      4 0 1 0 0 0 0 1 0
      5 0 1 0 0 0 0 0 0  
      6 0 0 1 0 0 0 0 1
      7 0 0 0 1 0 0 0 0
      8 0 0 0 0 0 1 0 0 
     
*/

public class Algo04_��������3_graph1_����_�������3_BFS {
	
		public static void main(String[] args) {
		
	    // �ε������� ������ ��尪���� ó�� 
	    int [][] graph = {
	    		{},
	    		{2, 3}, // 1�� �ε���(1�� ���)�� �̿� ����
	    		{4, 5}, // 2�� �ε���(2�� ���)�� �̿� ����
	    		{6},    // 3�� �ε���(3�� ���)�� �̿� ����
	    		{7},    // 4�� �ε���(4�� ���)�� �̿� ����
	    		{},     // 5�� �ε���(5�� ���)�� �̿� ����
	    		{8},    // 6�� �ε���(6�� ���)�� �̿� ����
	    		{},     // 7�� �ε���(7�� ���)�� �̿� ����
	    		{}};	// 8�� �ε���(8�� ���)�� �̿� ����	 
	    
	   //BFS
	   //�湮 ���� �����
	     StringBuilder sb = new StringBuilder();
	    
	     Queue<Integer> q = new LinkedList<>();
	     boolean [] visited = new boolean[9]; // �湮 ���� Ȯ��, �⺻���� false�� ������
	    
	     q.offer(1); // �������� ����
	     visited[1]=true;  // �������� �湮ó��
	     
	     while(!q.isEmpty()) {
	    	 int idx = q.poll();
	    	 sb.append(idx+" -> "); // �湮���� �����
	    	//����(poll)�� ������ ������ ��带 ã�Ƽ� offer
	    	 for (int linkedNode : graph[idx]) {
				  // �湮���� �ʾ��� ��쿡�� offer
				   if(!visited[linkedNode]) {
					   q.offer(linkedNode);
					   visited[linkedNode]=true;
				   }
			   }
	     }//end while
	    	 
	     System.out.println("BFS ��ȸ:" + sb.toString());	 
	     
	     
	}//end main
		
}//end class




