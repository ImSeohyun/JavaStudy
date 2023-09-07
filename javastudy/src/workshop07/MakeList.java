package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;
	 
	public MakeList() {
	 list = new ArrayList<Integer>();
	 }
	 // ArrayList 생성
	 public void makeArrayList(int size) {
		 Random r = new Random();
		 for(int i=1;i<=size;i++) {
			 list.add(r.nextInt(19)+10);
		 }
	 }
	 // ArrayList의 모든 값의 평균을 계산 하여 리턴
	 public double getAverage() {
		 double sum =0.0;
		 
		 for(int a : list) {
			 sum+=a;
		 }
		 return sum/list.size();
		 
	 }
	 // ArrayList를 리턴
	 public ArrayList<Integer> getList() {
		 return list;
	 }
}