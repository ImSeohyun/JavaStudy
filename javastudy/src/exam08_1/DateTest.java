package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception{
		
		//날짜 데이터
		Date d = new Date();
		
		System.out.println(d); //d.toString() 동일, 재정의됨
		//d.toString() 했는데 @클래스 16진수 값 나오면 Object의 메서드
		
		// java.text.SimpleDateFormat 클래스와 병행해서 사용한다.
				// 가. Date 타입 -----> String
				// Fri Jul 21 15:23:12 KST 2023 =====> 특정포맷을 가진 문자열로 변경
				/*
				 *   날짜 포맷
				 *   년도 : yyyy
				 *   월:   MM
				 *   일:   dd
				 *   시간: HH
				 *   분:   mm
				 *   초:   ss
				 */	
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
		String result = sdf.format(d);
		System.out.println(result);
		
		//나. String -> Date
		String s = "2023년07월21일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		Date d2 = sdf2.parse(s);
		System.out.println(d2);
	
	}
}
