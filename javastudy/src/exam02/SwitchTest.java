package exam02;

public class SwitchTest {

	public static void main(String[] args) {
		
		//3. switch 
		//byte, short, int, char, String, enum�� 6���� ��� ���� (long�� �Ǽ� ��� �Ұ�) 
		 short num = 10;

        switch(num){
            case 5: System.out.println("5"); break;
            case 10: System.out.println("10"); break;
            case 15: System.out.println("15"); break;
            default: System.out.println("default");
        }
        
        System.out.println("end");
        
        char c = 'A';
        switch(c){
          case 'A':System.out.println("A"); break;
          case 'B':System.out.println("B"); break;
         default: System.out.println("default");
        }
        
        String c2 = "A";
        switch(c2){
          case "A":System.out.println("A"); break;
          case "B":System.out.println("B"); break;
         default: System.out.println("default");
        }
        
        
	}
}