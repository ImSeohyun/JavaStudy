import java.util.PriorityQueue;

public class Algo03_��������_09_PriorityQueue {
	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(20);
		q.add(10);
		q.add(40);
		q.add(50);
		q.add(6);
		
		System.out.println(q); //�����ϰ� �����. ���ĵ� �� Ȯ�κҰ�
	
		//������ �� ���ĵǾ� ������
		for(int i=0; i<5; i++) {
			System.out.println(q.poll());
		}
	}
}
