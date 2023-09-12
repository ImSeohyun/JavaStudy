import java.util.Scanner;


/*
 	1***2***5
 	* 		*
 	* 		*
 	3*******4
 	
 	����: 
 		1 2 3 4 5
 	  1 0 1 1 0 0
 	  2 1 0 0 0 1
 	  3 1 0 0 1 0
 	  4 0 0 1 0 1
 	  5 0 1 0 1 0
 	
 	�Է�:
 	5 5 <- ����, ���� ����
 	5 4 <- ���⼭���� ����� ���� ����. 5�� 4 ���� 
 	5 2 <- 5�� 2 ���� 
 	1 2
 	3 4
 	3 1
---------
 	5 5 
 	5 4  
 	5 2
 	1 2
 	3 4
 	3 1
 	
 */

public class Algo04_��������3_graph1_����_������� {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();// ���� ����
		int m = sc.nextInt(); //���� ����
		//�������
		int[][] adjArr= new int[n+1][n+1];//n�� 0���� �����ؾ� �Ǳ� ������ ������� 1���� �ϱ� ���� n+1��.
		
		//���� ������ŭ �ݺ��� ������Ŀ� ����
		for(int i=0;i<m;i++) {
			// 5 4 �б�
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjArr[v1][v2]=1; //����Ǿ��ִ� ǥ��. 5-4 ����ǥ��
			adjArr[v2][v1]=1; //������̹Ƿ� �� �ݴ뵵 ǥ��. 4-5 ����ǥ��
		}
		//������� ���
		for(int i=1;i<adjArr.length;i++) {
			for(int j=1;j<adjArr.length;j++) {
				System.out.print(adjArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}//end main
	
}
