
import java.util.List;
import java.util.Scanner;

import com.dto.StudentDTO;
import com.dto.StudentPointDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {

		//화면처리 추가
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("******************************");
			System.out.println("    [학생 정보 관리 메뉴]      ");
			System.out.println("******************************");
			System.out.println("1. 전체목록");
			System.out.println("2. 학생 이름 검색");
			System.out.println("3. 학생 입학년도 범위 검색 (예: 2000부터 2003년까지");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표구분자)");
			System.out.println("5. 학생 휴학 일괄수정");
			System.out.println("6. 학과 정원 일괄수정");
			System.out.println("7. 학생 학점 검색");
			System.out.println("0. 종료");
			System.out.println("--------------------");
			System.out.print("메뉴 입력 =>");
			String num = scan.nextLine();
			if("1".equals(num)) {
				StudentService service = new StudentServiceImpl();
				List<StudentDTO> list = service.findAll();
				System.out.println("학번\t 이름 \t 주민번호 \t 주소 \t 입학년도 \t 휴학여부");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto); // dto.toString()
				}
				System.out.println("총 학생 수: "+list.size()+"명");
			}else if("2".equals(num)) {
				System.out.print("검색할 학생명을 입력하시오 =>");
				String name = scan.next();
				
				StudentService service = new StudentServiceImpl(); //다형성
				List<StudentDTO> list = service.search(name);
				System.out.println("학번\t 이름 \t 주민번호 \t 주소 \t 입학년도 \t 휴학여부");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
				System.out.println("총 학생 수: "+list.size()+"명");
			}else if("3".equals(num)) {
				System.out.print("시작 입학년도 입력하시오 =>");
				String d1 = scan.next();
				System.out.print("끝 입학년도 입력하시오 =>");
				String d2 = scan.next();
				
				StudentService service = new StudentServiceImpl(); //다형성
				List<StudentDTO> list = service.searchD(Integer.parseInt(d1),Integer.parseInt(d2));
				System.out.println("학번\t 이름 \t 주민번호 \t 주소 \t 입학년도 \t 휴학여부");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
				System.out.println("총 학생 수: "+list.size()+"명");
			}else if("4".equals(num)) {
				System.out.print("검색할 학생의 학번을 입력하시오 =>");
				String d1 = scan.next();
				String[] arr = d1.split(",");
				StudentService service = new StudentServiceImpl(); //다형성
				List<StudentDTO> list = service.searchNo(arr);
				System.out.println("학번\t 이름 \t 주민번호 \t 주소 \t 입학년도 \t 휴학여부");
				System.out.println("------------------------");
				for (StudentDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
				System.out.println("총 학생 수: "+list.size()+"명");
			}else if("5".equals(num)) {
				System.out.print("수정할 학생의 학번을 입력하시오 =>");
				String d1 = scan.next();
				String[] arr = d1.split(",");
				StudentService service = new StudentServiceImpl(); //다형성
				int n = service.updateAbs(arr);
				System.out.println("총 변경된 학생 수: "+arr.length+"명");
			}else if("6".equals(num)) {
				StudentService service = new StudentServiceImpl(); //다형성
				int n = service.updateCapa();
				System.out.println("총 변경된 학생 수: "+n);
			}else if("7".equals(num)) {
				System.out.print("학생의 학번을 입력하시오 =>");
				String name = scan.next();
				
				StudentService service = new StudentServiceImpl(); //다형성
				List<StudentPointDTO> list = service.searchP(name);
				System.out.println("학기 \t 학번 \t 이름 \t 과목명 \t 점수 \t 학점");
				System.out.println("------------------------");
				for (StudentPointDTO dto : list) {
					System.out.println(dto.toString()); // dto.toString()
				}
			}else if("0".equals(num)) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
			
		}//end while
		
	}//end main
}//end class