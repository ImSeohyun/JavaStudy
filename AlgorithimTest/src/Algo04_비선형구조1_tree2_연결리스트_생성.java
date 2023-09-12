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

class Node{
	int data; //��尪
	Node left;//���� �ڽ� ��� ������
	Node right;//������ �ڽ� ��� ������
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
public class Algo04_��������1_tree2_���Ḯ��Ʈ_���� {
	//��� ���� �޼���
	private static Node root;
	public static void createNode(int data, int leftData, int rightData) {
		
		//�ʱ���� ���� Ȯ��
		if(root ==null) { //�ƹ��͵� �� ��������ִ� ���� -> 0 1 2
			root = new Node(data);
			
			if(leftData != -1) {
				root.left = new Node(leftData); //���� �ڽ� ��� ����
			}
			if(rightData != -1) {
				root.right = new Node(rightData); //������ �ڽ� ��� ����
			}
			
		}else {
			//1 3 4
			//��Ʈ ��� ���� ���Ŀ� ������� ��� �� ������� ã�ƾ� ��
			searchNode(root,data,leftData,rightData);
			
		}
	}//end createNode
	
	//��Ʈ ��� ���� ���Ŀ� ������� ��� �� ������� ã���ִ� �޼���. ����Լ�
	public static void searchNode(Node node, int data, int leftData, int rightData) {
		
		if(node == null) {//ã�� ��� ���� ��� �޼��� ����
			return;
		}else if(node.data == data) {//��ġ ã�� ���
			if(leftData != -1) {
				node.left = new Node(leftData); //���� �ڽ� ��� ����
			}
			if(rightData != -1) {
				node.right = new Node(rightData); //������ �ڽ� ��� ����
			}
		}else { //�� ã�� ���. �� ã�ƾ� ��
			//���� Ž��
			searchNode(node.left, data, leftData, rightData);
			//������ Ž��
			searchNode(node.right, data, leftData, rightData);
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//��尹�� �Է�
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			// 0 1 2
			int x = sc.nextInt(); //0
			int l_child = sc.nextInt(); //1
			int r_child = sc.nextInt(); //2
			
			createNode(x, l_child,r_child);
		}
		
		//������ ���Ḯ��Ʈ ���
		System.out.println(root);
		
	}//end main
	
}
