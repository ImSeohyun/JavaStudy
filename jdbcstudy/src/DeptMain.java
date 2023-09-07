import java.util.List;
import java.util.Scanner;

import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {

		//ȭ��ó�� �߰�
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. ��ü���");
			System.out.println("2. �����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. �����ϱ�");
			System.out.println("0. ����");
			System.out.println("--------------------");
			String num = scan.nextLine();
			if("1".equals(num)) {
				// ���� ����
				DeptService service = new DeptServiceImpl(); //������
				List<DeptDTO> list = service.findAll();
				System.out.println("�μ���ȣ\t �μ��� \t �μ���ġ");
				System.out.println("------------------------");
				for (DeptDTO dto : list) {
					System.out.println(dto); // dto.toString()
				}
			}else if("2".equals(num)) {
				System.out.println("�μ���ȣ�� �Է��Ͻÿ�");
				String deptno = scan.next();
				System.out.println("�μ��� �Է��Ͻÿ�");
				String dname = scan.next();
				System.out.println("�μ���ġ�� �Է��Ͻÿ�");
				String loc = scan.next();
				// �Է¹��� 3���� ���� DTO�� �����ؼ� ���� ���ļ� DAO���� �����Ѵ�.
				DeptDTO dto = 
						new DeptDTO(Integer.parseInt(deptno), dname, loc);
				//���� ����
				DeptService service =
						new DeptServiceImpl();
				int n=0;
				try {
					n = service.insert(dto);
				} catch (DuplicatedDeptnoException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(n+" ���� ����Ǿ����ϴ�");
				
			}else if("3".equals(num)) {
				System.out.println("������ �μ���ȣ�� �Է��Ͻÿ�");
				String deptno = scan.next();
				System.out.println("������  �μ��� �Է��Ͻÿ�");
				String dname = scan.next();
				System.out.println("������ �μ���ġ�� �Է��Ͻÿ�");
				String loc = scan.next();
				DeptDTO dto = 
						new DeptDTO(Integer.parseInt(deptno), dname, loc);
				
				//Service ����
				DeptService service =
						new DeptServiceImpl();
				int n = service.update(dto);
				System.out.println(n+" ���� ���� �Ǿ����ϴ�");
				
			}else if("4".equals(num)) {
				System.out.println("������ �μ���ȣ�� �Է��Ͻÿ�");
				String deptno = scan.next();
				
				//Service ����
				DeptService service =
						new DeptServiceImpl();
				int n = service.delete(Integer.parseInt(deptno));
				System.out.println(n+" ���� ���� �Ǿ����ϴ�");
			}else if("5".equals(num)) {
				// ���� �� ����
				//������ ������ 
				System.out.println("������ �μ���ȣ�� �Է��Ͻÿ�");
				String deptno = scan.next();
				System.out.println("������  �μ��� �Է��Ͻÿ�");
				String dname = scan.next();
				System.out.println("������ �μ���ġ�� �Է��Ͻÿ�");
				String loc = scan.next();
				DeptDTO dto = 
						new DeptDTO(Integer.parseInt(deptno), dname, loc);
				
				//������ ������
				System.out.println("������ �μ���ȣ�� �Է��Ͻÿ�");
				String deptno2 = scan.next();
				
				//Service ����
				DeptService service = 
						new DeptServiceImpl();
				int n = 
				service.updateAndDelete(dto, Integer.parseInt(deptno2));
			}else if("0".equals(num)) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			
			
		}//end while
		
	}//end main
}//end class