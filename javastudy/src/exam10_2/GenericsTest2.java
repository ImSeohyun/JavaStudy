package exam10_2;

import java.util.Date;

//제너릭스 등장배경
class Box2<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
	
}

public class GenericsTest2 {

	public static void main(String[] args) {
		
		//문자열만 저장
		Box2<String> b2 = new Box2();
		Box2<String> b1 = new Box2<String>();
		b1.setValue("홍길동");
		//b1.setValue(10); //장점1: 컴파일 시에 잘못된 데이터 저장 인지 가능

		String str = b1.getValue(); //장점2: 형변환 불필요
		System.out.println("문자열 길이: "+str.length());
		
		//날짜만 저장
		Box2<Date> b3 = new Box2<Date>();
		b3.setValue(new Date());
		//b1.setValue(10); //장점1: 컴파일 시에 잘못된 데이터 저장 인지 가능
		Date d = (Date)b3.getValue(); //장점2: 형변환 불필요
		System.out.println("날짜: "+d.getYear());
	}
}
