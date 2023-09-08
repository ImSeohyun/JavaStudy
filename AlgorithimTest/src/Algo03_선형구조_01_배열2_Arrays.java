import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_01_배열2_Arrays {

	public static void main(String[] args) {

		//Arrays클래스
		
		//1.리스트 생성 
		List<String> list = Arrays.asList("A","B");
		
		//2. 임의값으로 채우기
		String[] name = {"A","B","C"};
		Arrays.fill(name, "x");
		System.out.println("2. 임의값으로 채우기 "+Arrays.toString(name)); //[x,x,x]
		
		Arrays.fill(name, 0,2,"A");
		System.out.println("2. 임의값으로 채우기 "+Arrays.toString(name)); //[A,A,x]
		
		//3. 배열값 비교
		int[] n = {1,2,3};
		int[] n2 = {1,2,3};
		System.out.println("3. 배열값 비교 "+Arrays.equals(n,n2)); //true
		
		//4. 정렬
		Integer [] n3 = { 6,2,7,98,24};
		Arrays.sort(n3); //오름차순 기본
		Arrays.sort(n3, Comparator.reverseOrder()); //내림차순
		//Comparator.reverseOrder() 사용위해선 클래스타입이어야 함
		System.out.println("4. 정렬 "+Arrays.toString(n3)); //[2,6,7,24,98]
		
		//5. 특정 값의 위치 검색
		int [] n4 = { 6,2,7,98,24};
		int idx = Arrays.binarySearch(n4, 98);
		System.out.println("5. 특정 값의 위치 검색 "+idx);//3
		
		//6. 배열 크기 변경
		int[] n5 = {1,2,3};
		n5 = Arrays.copyOf(n5, 5);
		System.out.println("6. 배열 크기 변경 "+Arrays.toString(n5));//[1, 2, 3, 0, 0]

		//7. 배열에서 스트림 생성
		int[] n6 = {1,2,3};
		Arrays.stream(n6).forEach(System.out::println);
		
		
		
		
	}
}
