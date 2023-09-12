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
public class Algo04_비선형구조1_tree1_배열순회 {
	
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
		
		//순회
		order(0);

	}//end main
	//순회 메서드
	private static void order(int x) {
		
		//자식여부 확인
		if(tree[x][0]==-1 && tree[x][1]==-1) {//자식 없는 경우
			System.out.print(x+" ");
		}else {//자식 있는 경우
		//	System.out.print("전위: "+x+" "); //0 1 3 4 2 5
			if(tree[x][0]!=-1){//왼쪽 자식 있는경우
				order(tree[x][0]);
			}
			//System.out.print("중위: "+x+" "); //3 1 4 0 2 5
			if(tree[x][1]!=-1){//오른쪽 자식 있는경우
				order(tree[x][1]);
			}
			System.out.print("후위: "+x+" "); //3 4 1 5 2 0
			
		}
	}
	
	
}
