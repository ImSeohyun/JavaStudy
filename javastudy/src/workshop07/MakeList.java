package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;
	 
	public MakeList() {
	 list = new ArrayList<Integer>();
	 }
	 // ArrayList ����
	 public void makeArrayList(int size) {
		 Random r = new Random();
		 for(int i=1;i<=size;i++) {
			 list.add(r.nextInt(19)+10);
		 }
	 }
	 // ArrayList�� ��� ���� ����� ��� �Ͽ� ����
	 public double getAverage() {
		 double sum =0.0;
		 
		 for(int a : list) {
			 sum+=a;
		 }
		 return sum/list.size();
		 
	 }
	 // ArrayList�� ����
	 public ArrayList<Integer> getList() {
		 return list;
	 }
}