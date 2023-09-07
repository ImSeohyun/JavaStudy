package workshop07;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// argument로 정수를 받는다.
		// MakeList 객체 생성
		MakeList m = new MakeList();
		
		// 무작위의 번호 발생 후 저장
		m.makeArrayList(Integer.parseInt(args[0]));
		
		ArrayList<Integer> list = m.getList();
		 // for문을 이용하여 ArrayList의 정보 출력하고 평균을 출력 한다.
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		// 평균 출력
		System.out.println("평균: "+ m.getAverage());
	}
}
