package exam02;

public class TypeCastTest2 {

	public static void main(String[] args) {
		
		//1. 묵시적 형변환
		
		//가. byte > short > int > long > float > double
		
		//큰 타입 = 작은 타입;의 형태면 어느 형변환이던 가능
		
		byte b =10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float f = b4;
		double f2 = f;
		double f3 = b;
		
		//반대 경우는 에러
		float x = 3.14f;
		//int x2 = x;
		
		
		//나. char -> int (아스키코드 값)
		char c = 'A'; //65
		char c2 = 'a'; //97
		int n =c;
		int n2 = c2;
		System.out.println(n+" "+ n2);
		System.out.println('A'+1); //문자는 연산가능
		
		//다. int 보다 작은 데이터형의 연산은 int로 반환
		short s =10;
		short s2 =10;
		//short s3 = s + s2; short=int 형식으로 처리됨
		
		//라. 타입과 작은타입의 연산은 큰타입으로 반환
		float ff = 3.14F;
		int nn = 10;
		float ff2 = ff + nn;
	}
}
