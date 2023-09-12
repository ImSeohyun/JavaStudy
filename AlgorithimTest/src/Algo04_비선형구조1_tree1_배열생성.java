import java.util.Scanner;


/*
 		0
 	   / \
 	  1   2
 	 / \   \
 	3   4   5
 	
 	입력:
 	6
       0  1  2
       1  3  4
       2 -1  5
       3 -1 -1
       4 -1 -1
       5 -1 -1
 	
 	
 */
public class Algo04_비선형구조1_tree1_배열생성 {
	
	static int n; //노드 갯수
	static int[][] tree; //노드 저장할 2차원 배열
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//노드갯수 입력
		n=sc.nextInt();
		
		//2차원 배열 생성
		tree = new int[n][2]; //[n][0]은 왼쪽자식, [n][1]은 오른쪽자식
		
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
				System.out.println(i+"값의 자식: "+ tree[i][j]);
			}
		}


	}//end main
}
