import java.util.Scanner;


/*
 	1***2***5
 	* 		*
 	* 		*
 	3*******4
 	
 	생성: 
 		1 2 3 4 5
 	  1 0 1 1 0 0
 	  2 1 0 0 0 1
 	  3 1 0 0 1 0
 	  4 0 0 1 0 1
 	  5 0 1 0 1 0
 	
 	입력:
 	5 5 <- 정점, 간선 갯수
 	5 4 <- 여기서부터 연결된 정점 지정. 5와 4 연결 
 	5 2 <- 5와 2 연결 
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

public class Algo04_비선형구조3_graph1_생성_인접행렬 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();// 정점 갯수
		int m = sc.nextInt(); //간선 갯수
		//인접행렬
		int[][] adjArr= new int[n+1][n+1];//n은 0부터 시작해야 되기 때문에 요소접근 1부터 하기 위해 n+1로.
		
		//간선 갯수만큼 반복해 인접행렬에 저장
		for(int i=0;i<m;i++) {
			// 5 4 읽기
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjArr[v1][v2]=1; //연결되어있다 표시. 5-4 연결표현
			adjArr[v2][v1]=1; //양방향이므로 그 반대도 표시. 4-5 연결표현
		}
		//인접행렬 출력
		for(int i=1;i<adjArr.length;i++) {
			for(int j=1;j<adjArr.length;j++) {
				System.out.print(adjArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}//end main
	
}
