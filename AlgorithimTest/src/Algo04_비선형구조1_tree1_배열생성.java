import java.util.Scanner;


/*
 		0
 	   / \
 	  1   2
 	 / \   \
 	3   4   5
 	
 	�Է�:
 	6
       0  1  2
       1  3  4
       2 -1  5
       3 -1 -1
       4 -1 -1
       5 -1 -1
 	
 	
 */
public class Algo04_��������1_tree1_�迭���� {
	
	static int n; //��� ����
	static int[][] tree; //��� ������ 2���� �迭
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//��尹�� �Է�
		n=sc.nextInt();
		
		//2���� �迭 ����
		tree = new int[n][2]; //[n][0]�� �����ڽ�, [n][1]�� �������ڽ�
		
		for(int i=0;i<n;i++) {
			// 0 1 2
			int x = sc.nextInt(); //0
			int l_child = sc.nextInt(); //1
			int r_child = sc.nextInt(); //2
			tree[x][0] = l_child;
			tree[x][1] = r_child;
		}
	
		for(int i=0;i<tree.length;i++) {
			for(int j=0;j<tree[i].length;j++) {
				System.out.println(i+"���� �ڽ�: "+ tree[i][j]);
			}
		}


	}//end main
}
