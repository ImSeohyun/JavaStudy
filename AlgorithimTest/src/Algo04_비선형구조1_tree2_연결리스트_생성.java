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

class Node{
	int data; //노드값
	Node left;//왼쪽 자식 노드 참조값
	Node right;//오른쪽 자식 노드 참조값
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
public class Algo04_비선형구조1_tree2_연결리스트_생성 {
	//노드 생성 메서드
	private static Node root;
	public static void createNode(int data, int leftData, int rightData) {
		
		//초기상태 여부 확인
		if(root ==null) { //아무것도 안 만들어져있는 상태 -> 0 1 2
			root = new Node(data);
			
			if(leftData != -1) {
				root.left = new Node(leftData); //왼쪽 자식 노드 생성
			}
			if(rightData != -1) {
				root.right = new Node(rightData); //오른쪽 자식 노드 생성
			}
			
		}else {
			//1 3 4
			//루트 노드 생성 이후에 만들어진 노드 중 어떤것인지 찾아야 됨
			searchNode(root,data,leftData,rightData);
			
		}
	}//end createNode
	
	//루트 노드 생성 이후에 만들어진 노드 중 어떤것인지 찾아주는 메서드. 재귀함수
	public static void searchNode(Node node, int data, int leftData, int rightData) {
		
		if(node == null) {//찾을 노드 없는 경우 메서드 종료
			return;
		}else if(node.data == data) {//위치 찾은 경우
			if(leftData != -1) {
				node.left = new Node(leftData); //왼쪽 자식 노드 생성
			}
			if(rightData != -1) {
				node.right = new Node(rightData); //오른쪽 자식 노드 생성
			}
		}else { //못 찾은 경우. 더 찾아야 됨
			//왼쪽 탐색
			searchNode(node.left, data, leftData, rightData);
			//오른쪽 탐색
			searchNode(node.right, data, leftData, rightData);
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//노드갯수 입력
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			// 0 1 2
			int x = sc.nextInt(); //0
			int l_child = sc.nextInt(); //1
			int r_child = sc.nextInt(); //2
			
			createNode(x, l_child,r_child);
		}
		
		//생성된 연결리스트 출력
		System.out.println(root);
		
	}//end main
	
}
