package workshop07;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// argument�� ������ �޴´�.
		// MakeList ��ü ����
		MakeList m = new MakeList();
		
		// �������� ��ȣ �߻� �� ����
		m.makeArrayList(Integer.parseInt(args[0]));
		
		ArrayList<Integer> list = m.getList();
		 // for���� �̿��Ͽ� ArrayList�� ���� ����ϰ� ����� ��� �Ѵ�.
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		// ��� ���
		System.out.println("���: "+ m.getAverage());
	}
}
