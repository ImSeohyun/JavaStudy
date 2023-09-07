package exam02;

public class OperatorTest4 {

	public static void main(String[] args) {
		
		//4. 논리연산자 (실행 결과는 논리값)
		//js 처럼 임의의 값을 논리값으로 사용 불가
		
		//가. &&
		System.out.println(true && true); //f
		System.out.println(true && false); //f
		System.out.println(false && true); //t 
		System.out.println(false && false); //t
		System.out.println();
		
		//나. || 
		System.out.println(true || true); //t
		System.out.println(true || false); //t
		System.out.println(false || true); //t
		System.out.println(false || false); //f
		System.out.println();
		
		
		//다. ! ( 부정 )
		System.out.println(!true); //f
		System.out.println(!false); //t
	}
}
