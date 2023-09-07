package exam02;

public class PDT_DataType {

	public static void main(String[] args) {

		// 1. 문자 리터럴 - char 기본형
		System.out.println('A');
		System.out.println('홍');
		
		//여러 문자열 - String 참조형
		System.out.println("홍길동");
		
		// 2. 이스케이프 문자
		System.out.println("홍길\n동");
		System.out.println("홍길\t동");
		System.out.println("홍길\'동");
		System.out.println("홍길\"동");
		System.out.println("홍길\\동");
		
		// 3. 정수 리터럴
		System.out.println(10); //10진수
		
		System.out.println(0b01); //2진수
		
		System.out.println(01); //8진수
		
		System.out.println(0x0); //16진수
		System.out.println(0xA); //16진수
		System.out.println(0xF); //16진수
		
		//4byte인 int 저장범위: -2147483648 ~ +2147483647
		System.out.println(2147483647);
		//System.out.println(2147483648); out of range
		System.out.println(2147483648L); //4byte보다 큰 점수는 L 지점에서 long으로 처리
		
		// 4. 실수 리터럴
		System.out.println(3.14); //double
		System.out.println(3.14D); //double
		System.out.println(3.14d); //double

		System.out.println(3.14F); //float 처리
		System.out.println(3.14f); //float 처리
		System.out.println(3.14e3); //지수 표현
	}

}
