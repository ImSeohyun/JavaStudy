import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dto.DeptDTO;

public class DeptMain2 {

	public static void main(String[] args) throws IOException {
		
		String resource = "com/config/Configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		//insert �۾�
//		DeptDTO dto = new DeptDTO(99, "����", "����");
//		int n = session.insert("DeptMapper2.addDept", dto);
//		System.out.println(n+ "���� �����");

		//update �۾�
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("deptno", 99);
//		map.put("dname", "���ߺ�");
//		map.put("loc", "�����");
//		
//		int n2 = session.update("DeptMapper2.updateDept", map);
//		System.out.println(n2+ "���� �����");
		
		//delete �۾�
		int n3 = session.delete("DeptMapper2.deleteDept", 99);
		System.out.println(n3+ "���� ������");
		
		
		session.commit();//Ʈ����� ����
		
		
		session.close();
		
	}
}
