package exam05_2;

class Count {
	
	int n; //인스턴스 변수, 객체 생성 마다 만들어짐 
	static int m; //static 변수, 프로그램 실행 시 한 번 만들어짐,이탤릭체, 자동초기화, 클래스명으로 접근
	
	public Count() {
		n++;
		m++;
	}
	public void n_print(){
		System.out.println("n"+n); //인스턴스 변수 접근 가능
		System.out.println("m"+m); //static 변수 접근 가능
	}
	
	public static void m_print() { //static 메서드
		//System.out.println("n"+n); //인스턴스 변수 접근 불가
		//System.out.println(this); //this 사용 불가
		System.out.println("m"+m); // static 변수 접근 가능
	}
}

public class TestMain {

	public static void main(String[] args) {

		//new 하기 전 static 접근 가능
		System.out.println(Count.m); //0
		Count.m_print(); //new 하지 않고 메서드 사용목적
		
		//Count 객체 생성 몇 번 했는지
		Count c = new Count();
		c.n_print();
		Count c2 = new Count();
		c2.n_print();
		
		System.out.println(Count.m);
		
	}

}
