package exam08_1;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		String s = "Hello";
		//String 클래스의 인스턴스 메서드
		System.out.println("1. 문자열 길이:"+s.length());
		
		char c = s.charAt(1);
		System.out.println("2. 특정 문자 얻기:"+c);
		System.out.println("2. 특정 문자 얻기:"+s.charAt(1));

		System.out.println("3. 특정 문자 위치:"+s.indexOf('e'));
		System.out.println("3. 특정 문자 위치:"+s.indexOf('x'));//없으면 -1 
		
		System.out.println("4. 대문자: "+s.toUpperCase());
		System.out.println("5. 소문자: "+s.toLowerCase());
		
		System.out.println("6. 문자열 연결: "+s.concat("~~~"));

		System.out.println("7. 부분열: "+s.substring(1));//1부터 끝까지
		System.out.println("7. 부분열: "+s.substring(1,4 ));//1~3까지

		System.out.println("8. 문자열 포함 여부: "+s.contains("e"));
		System.out.println("8. 문자열 포함 여부: "+s.contains("X"));
		
		System.out.println("9. 문자열 치환: "+s.replace("e", "X"));
		
		System.out.println("10. 문자열 비교: "+s.equals("Hello"));
		System.out.println("10. 문자열 비교: "+s.equals("hello"));
		System.out.println("10. 문자열 비교(대소문자 무시): "+s.equalsIgnoreCase("hello"));

		String s2 = "            world        ";
		System.out.println("11. 공백제거: "+s.trim());
		System.out.println("11. 공백제거: "+s.trim().length());
		
		//구분자로 분리 -> 배열로 반환
		String s3 = "AAA/BBB/CCC";
		String[] arr = s3.split("/");
		System.out.println("12. 구분자로 분리: "+Arrays.toString(arr));
		
		////////String의 static 메서드 -> String.메서드명
		System.out.println("13. 포맷 지정: ");
		System.out.println(String.format("이름:%s, age:%d", "hong",20));
		
		System.out.println("14.문자열로 변경"+String.valueOf(10));
		System.out.println("14.문자열로 변경"+String.valueOf(3.14));
		System.out.println("14.문자열로 변경"+String.valueOf(new char[] {'A','B'}));
		
		//원본 문자열 -> String 문자열은 변경되지 않는다. 새로운 문자열이 생성된 것
		System.out.println(s);

	}
}