package exam08_1;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
	
		//1. 기본 형태
		String s = "aaa/bbb/ccc";
		
		StringTokenizer st = new StringTokenizer(s,"/");//첫번째 string, 두번째 구분자
		System.out.println("token 갯수: "+ st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//2. mix 형태
		String s2 = "A,ab,xx;E|XX/yy";
		StringTokenizer st2 = new StringTokenizer(s2,"/,");
		System.out.println("token 갯수: "+st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
