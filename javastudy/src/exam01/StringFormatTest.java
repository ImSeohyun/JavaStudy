package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		
		//포맷 출력
		
		//1. String.format(String 형식문자, Object...값들)
		String result = String.format("이름:%s, 나이:%d, 키:%f,성별:%c,결혼여부:%b", "홍길동", 20, 167.23, '남', true);	
		String result2 = String.format("이름:%s, 나이:%d, 키:%.2f,성별:%c,결혼여부:%b", "홍길동", 20, 167.23, '남', true);	
		System.out.println(result);
		System.out.println(result2);
		
		//2. System.out.printf(String 형식문자, Object...값들)
		System.out.printf("이름:%s, 나이:%d, 키:%.2f,성별:%c,결혼여부:%b \n", "홍길동", 20, 167.23, '남', true);
		
		//printf는 줄바꿈이 없으니 \n을 마지막에 써 줄바꾸기 가능
		System.out.printf("이름:%s, 나이:%d, 키:%.2f,성별:%c,결혼여부:%b", "홍길동", 20, 167.23, '남', true);

	}
}
