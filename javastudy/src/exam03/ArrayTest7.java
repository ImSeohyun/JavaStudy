package exam03;

public class ArrayTest7 {

	public static void main(String[] args) {
		
		//2���� �迭 ��� - ��������
		int[][] n = new int[2][];
		n[0] = new int[1];
		n[1] = new int[2];
		
		System.out.println(n[0][0]);
		System.out.println(n[1][0]);
		System.out.println(n[1][1]);
		
		System.out.println("�����"+n.length);
		System.out.println("2�� ������"+n[1].length);
		
		//�ʱ�ȭ
		n[0][0]=1;
		n[1][0]=3;
		n[1][1]=4;
		
		for(int i=0;i<n.length;i++){ //�༱��
			for(int j=0;j<n[i].length;j++){ //������
			System.out.println(n[i][j]);
			}
		}
		
		//for each ��
		for(int[] i:n) {
			for(int j:i) {
				System.out.println(j);
			}
		}
	}
}
