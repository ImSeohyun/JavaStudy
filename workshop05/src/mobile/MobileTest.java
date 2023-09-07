package mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		Ltab l = new Ltab("Ltab",500,"AP-01");
		Otab o = new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("---------------------------------");
		System.out.println(l.getMobileName()+"\t"+l.getBattery()+"\t"+l.getOsType());
		System.out.println(o.getMobileName()+"\t"+o.getBattery()+"\t"+o.getOsType());
		System.out.println();
		
		System.out.println("10분 충전");
		l.charge(10);
		o.charge(10);
		
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("---------------------------------");
		System.out.println(l.getMobileName()+"\t"+l.getBattery()+"\t"+l.getOsType());
		System.out.println(o.getMobileName()+"\t"+o.getBattery()+"\t"+o.getOsType());
		System.out.println();
		
		System.out.println("5분 통화");
		l.operate(5);
		o.operate(5);
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("---------------------------------");
		System.out.println(l.getMobileName()+"\t"+l.getBattery()+"\t"+l.getOsType());
		System.out.println(o.getMobileName()+"\t"+o.getBattery()+"\t"+o.getOsType());
		
	}
}
