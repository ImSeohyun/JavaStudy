import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_02_ArrayList {

	public static void main(String[] args) {

		// ArrayList 생성
		List<Integer> x =new ArrayList<Integer>();
		x.add(3);
		x.add(13);
		x.add(23);
		System.out.println(x);

		List<Integer> xx =new ArrayList<Integer>();
		xx.add(7);
		xx.add(6);
		xx.add(4);
		
		// ArrayList에  ArrayList 저장
		x.addAll(xx);
		System.out.println(x);
		
	}
}
