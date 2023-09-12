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

public class Algo04_��������3_graph1_����_�������2_DFS {
	
		public static void main(String[] args) {
		
	    // �ε������� ������ ��尪���� ó�� 
	    int [][] graph = {
	    		{},
	    		{3, 2}, // 1�� �ε���(1�� ���)�� �̿� ����
	    		{5, 4}, // 2�� �ε���(2�� ���)�� �̿� ����
	    		{6},    // 3�� �ε���(3�� ���)�� �̿� ����
	    		{7},    // 4�� �ε���(4�� ���)�� �̿� ����
	    		{},     // 5�� �ε���(5�� ���)�� �̿� ����
	    		{8},    // 6�� �ε���(6�� ���)�� �̿� ����
	    		{},     // 7�� �ε���(7�� ���)�� �̿� ����
	    		{}};	// 8�� �ε���(8�� ���)�� �̿� ����	 
	    
	   //DFS ( ���� �켱 Ž�� ) 
	   // �˰��� ����
	   
	   //1. ���� ����, boolean�迭�� �����湮���� Ȯ��
	   //2. ���� ���۳�� ���� ( 1 ���� ) , boolean���� true
	   //3. pop 1 
	   //4. pop �� 1�� ����� ������ ���� ( 2, 3)
	
	   //�湮 ���� �����
	    StringBuilder sb = new StringBuilder();
	    
	   Stack<Integer> stack  = new Stack<Integer>();
	   boolean [] visited = new boolean[9]; // �湮 ���� Ȯ��, �⺻���� false�� ������
	    
	   stack.push(1);    // �������� ����
	   visited[1]=true;  // ���۳�� �湮ó��
	   
	   // ���ÿ� ���� ������ �ߴ�
	   while(!stack.isEmpty()) {
		   int idx = stack.pop();
		   sb.append(idx+" -> "); // �湮���� �����
		   //����(pop)�� ������ ������ ��带 ã�Ƽ� push
		   for (int linkedNode : graph[idx]) {
			  // �湮���� �ʾ��� ��쿡�� push
			   if(!visited[linkedNode]) {
				   stack.push(linkedNode);
				   visited[linkedNode]=true;
			   }
		   }
	   }//end while
	    
	   System.out.println("DFS ��ȸ:" + sb.toString());
	   //DFS ��ȸ:1 -> 3 -> 6 -> 8 -> 2 -> 5 -> 4 -> 7 ->
	   //DFS ��ȸ:1 -> 2 -> 4 -> 7 -> 5 -> 3 -> 6 -> 8 -> 
	}//end main
		
}//end class




