package cafe;

public class CafeTest {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		
		Coffee c1 = new Coffee("Americano",4000);
		Coffee c2 = new Coffee("Caffelatte",5000);
		Coffee c3 = new Coffee("Macchiato",6000);
		
		cafe.setCoffee(c1);
		cafe.setCoffee(c2);
		cafe.setCoffee(c3);
		
		for(Coffee c: cafe.getCoffeeList()) {
			System.out.println(c.toString());			
		}
		System.out.println();
		System.out.println(String.format("Coffee ������ ��: %d�� ",cafe.totalPrice()));
		System.out.printf("Coffee ������ ��: %d�� \n ",cafe.totalPrice());
		
	}
}
