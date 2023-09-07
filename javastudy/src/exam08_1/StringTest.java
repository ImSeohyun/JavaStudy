package exam08_1;

public class StringTest {

	public static void main(String[] args) {
		
		//1. String 클래스 이용한 문자열 생성
		
		//가. 리터럴 이용(일반적) -> 동일 문자열이면 재사용(주소 같음)
		String s = "hello";
		String s2 = "hello";
		
		
		//나. new 이용 -> 동일 문자열이라도 매번 생성
		String x = new String("hello");
		String x2 = new String("hello");
		
		System.out.println(s);
		System.out.println(x);
		System.out.println(s==s2); //true
		System.out.println(x==x2); //false
		//문자열 비교는 절대료 == 하면 안된다. 반드시  equals 메서드 사용해야함
		System.out.println(s.equals(s2));
	}
}
