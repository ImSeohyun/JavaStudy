package exam03;

public class ArrayTest6 {

	public static void main(String[] args) {
		
		//1. 1���� �迭 ���
		
		//��. �迭 ����
		int[][] n;
		
		//��. �迭 ����
		n = new int[3][2];
		System.out.println("�����:"+n.length);
		System.out.println("1���� ������:"+n[0].length);
		
		//0���� �ڵ� �ʱ�ȭ
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);
		
		for(int i=0;i<n.length;i++){ //�༱��
			for(int j=0;j<n[i].length;j++){ //������
			System.out.println(n[i][j]);
			}
		}
		
		// ����� �ʱ�ȭ
		n[0][0]=1;
		n[0][1]=2;
		n[1][0]=3;
		n[1][1]=4;
		n[2][0]=5;
		n[2][1]=6;
		
		//for each ��
		for(int[] i:n) {
			for(int j:i) {
				System.out.println(j);
			}
		}
		
	}
}
