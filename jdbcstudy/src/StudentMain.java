
import java.util.List;
import java.util.Scanner;

import com.dto.StudentDTO;
import com.dto.StudentPointDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {

		//ȭ��ó�� �߰�
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("******************************");
			System.out.println("    [�л� ���� ���� �޴�]      ");
			System.out.println("******************************");
			System.out.println("1. ��ü���");
			System.out.println("2. �л� �̸� �˻�");
			System.out.println("3. �л� ���г⵵ ���� �˻� (��: 2000���� 2003�����");
			System.out.println("4. �л� �й����� ���� �˻� (��ǥ������)");
			System.out.println("5. �л� ���� �ϰ�����");
			System.out.println("6. �а� ���� �ϰ�����");
			System.out.println("7. �л� ���� �˻�");
			System.out.println("0. ����");
			System.out.println("--------------------");
			System.out.print("�޴� �Է� =>");
			String num = scan.nextLine();
			if("1".equals(num)) {
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.findAll();
				System.out.println("�й�\t �̸� \t �ֹι�ȣ \t �ּ� \t ���г⵵ \t ���п���");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto); // dto.toString()
				}
				System.out.println("�� �л� ��: "+list.size()+"��");
			}else if("2".equals(num)) {
				System.out.print("�˻��� �л����� �Է��Ͻÿ� =>");
				String name = scan.next();
				
				StudentService service = new StudentServiceImpl(); //������
				List<StudentDTO> list = service.search(name);
				System.out.println("�й�\t �̸� \t �ֹι�ȣ \t �ּ� \t ���г⵵ \t ���п���");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
				System.out.println("�� �л� ��: "+list.size()+"��");
			}else if("3".equals(num)) {
				System.out.print("���� ���г⵵ �Է��Ͻÿ� =>");
				String d1 = scan.next();
				System.out.print("�� ���г⵵ �Է��Ͻÿ� =>");
				String d2 = scan.next();
				
				StudentService service = new StudentServiceImpl(); //������
				List<StudentDTO> list = service.searchD(Integer.parseInt(d1),Integer.parseInt(d2));
				System.out.println("�й�\t �̸� \t �ֹι�ȣ \t �ּ� \t ���г⵵ \t ���п���");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
				System.out.println("�� �л� ��: "+list.size()+"��");
			}else if("4".equals(num)) {
				System.out.print("�˻��� �л��� �й��� �Է��Ͻÿ� =>");
				String d1 = scan.next();
				String[] arr = d1.split(",");
				StudentService service = new StudentServiceImpl(); //������
				List<StudentDTO> list = service.searchNo(arr);
				System.out.println("�й�\t �̸� \t �ֹι�ȣ \t �ּ� \t ���г⵵ \t ���п���");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
				System.out.println("�� �л� ��: "+list.size()+"��");
			}else if("5".equals(num)) {
				System.out.print("������ �л��� �й��� �Է��Ͻÿ� =>");
				String d1 = scan.next();
				String[] arr = d1.split(",");
				StudentService service = new StudentServiceImpl(); //������
				int n = service.updateAbs(arr);
				System.out.println("�� ����� �л� ��: "+arr.length+"��");
			}else if("6".equals(num)) {
				StudentService service = new StudentServiceImpl(); //������
				int n = service.updateCapa();
				System.out.println("�� ����� �л� ��: "+n);
			}else if("7".equals(num)) {
				System.out.print("�л��� �й��� �Է��Ͻÿ� =>");
				String name = scan.next();
				
				StudentService service = new StudentServiceImpl(); //������
				List<StudentPointDTO> list = service.searchP(name);
				System.out.println("�б� \t �й� \t �̸� \t ����� \t ���� \t ����");
				System.out.println("------------------------");
				for (StudentPointDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
			}else if("0".equals(num)) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			
		}//end while
		
	}//end main
}//end class