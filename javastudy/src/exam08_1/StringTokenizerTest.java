package exam08_1;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
	
		//1. �⺻ ����
		String s = "aaa/bbb/ccc";
		
		StringTokenizer st = new StringTokenizer(s,"/");//ù��° string, �ι�° ������
		System.out.println("token ����: "+ st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//2. mix ����
		String s2 = "A,ab,xx;E|XX/yy";
		StringTokenizer st2 = new StringTokenizer(s2,"/,");
		System.out.println("token ����: "+st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
