import java.util.PriorityQueue;

public class Algo03_선형구조_09_PriorityQueue {
	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(20);
		q.add(10);
		q.add(40);
		q.add(50);
		q.add(6);
		
		System.out.println(q); //랜덤하게 저장됨. 정렬된 값 확인불가
	
		//삭제될 때 정렬되어 삭제됨
		for(int i=0; i<5; i++) {
			System.out.println(q.poll());
		}
	}
}
