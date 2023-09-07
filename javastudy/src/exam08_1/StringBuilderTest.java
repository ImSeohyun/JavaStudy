package exam08_1;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//StringBuilder 클래스 이용한 문자열 생성 -> 버퍼로 동작돼서 자신의 문자열이 변경됨
		StringBuffer b = new StringBuffer("HeLLo");
		
		//메서드
		System.out.println("1. 추가:"+ b.append("hello"));
		System.out.println("1. 추가:"+ b.append(10));
		System.out.println("1. 추가:"+ b.append(4.12));
		
		System.out.println("2. 삽입:"+ b.insert(0, "hong"));
		System.out.println("2. 삽입:"+ b.insert(0, 100));
		
		System.out.println("3. 삭제:"+b.delete(0, 6));//0~5까지 삭제
		
		//charAt, substring,indexof 지원
		System.out.println("4. 거꾸로:"+b.reverse());
		
		System.out.println(b);
		//가장 마지막 작업은 String으로 저장해서 사용된다
		String s = b.toString();
		System.out.println("최종결과:"+s);
		
	}
}
