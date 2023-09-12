import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.sql.rowset.serial.SerialArray;



public class Algo05_����1_��������_selection_sort {

	// ��ȯ
	public static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
    }
	// ������ �޼���
	// ��������: ���ĵ��� ���� �迭���� �ּҰ��� ã�Ƽ� ���� �� ���� ��ҿ� ��ȯ
	public static void selection_sort(int [] arr, int size) {
		for(int i=0; i<size-1;i++) { // ������ ȸ���� �ݺ��� �ʿ� ����
System.out.printf("%d ����:", i+1);	
			int minIdx=i;
			//�ּҰ� ã��
			for(int j=i+1; j < size; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}//end for
System.out.print("��ȯ ��ġ �� ��:" + i +" " + arr[i]);			
System.out.println(" �ּҰ�:" + arr[minIdx]);			
			// i ��° ���� ã�� �ּҰ�(minIdx)�� ���� ��ȯ
			swap(arr, i, minIdx);
System.out.println(Arrays.toString(arr));
		}//end for
	}//end selection_sort
	
	//������ ������ ����
	static int [] arr = {7,3,2,8,9,4,6,1,5};
	
	public static void main(String[] args) {
		
		 int size = arr.length;
	    
		 selection_sort(arr, size);
		 
		 //���ĵ� �� ���
		 for(int x: arr) {
			 System.out.print(x+" "); // 1 2 3 4 5 6 7 8 9 
		 }
		 
	}//end main
}//end class




