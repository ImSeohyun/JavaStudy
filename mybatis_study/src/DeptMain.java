import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeptMain {

	public static void main(String[] args) throws IOException {
		
		String resource = "Configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		//findByDeptno 호출
		DeptDTO dto = session.selectOne("DeptMapper.findByDeptno", 10);
		System.out.println(dto);
		System.out.println("------------------------------------");
		
		List<DeptDTO> list = session.selectList("DeptMapper.findAll");
		for(DeptDTO xxx: list) {
			System.out.println(xxx);
		}
		System.out.println("=================================");

		//findByDeptnoAndDname
		DeptDTO dto2 = new DeptDTO();
		dto2.setDeptno(10);
		dto2.setDname("인사");
		List<DeptDTO> list2 = session.selectList("DeptMapper.findByDeptnoAndDname",dto2);

		for(DeptDTO xxx: list2) {
			System.out.println(xxx);
		}
		
		System.out.println("=================================");
		//findByDeptnoAndDnameMap
		HashMap<String, Object> map = new HashMap<>();
		//하나는 int고 하나는 string일때 obj로 받기,string으로 해도 자동 형변환돼서 문제 없긴함
		map.put("xxx", 10);
		map.put("yyy", "인사");
		List<DeptDTO> list3 = session.selectList("DeptMapper.findByDeptnoAndDnameMap",map);

		for(DeptDTO xxx: list3) {
			System.out.println(xxx);
		}
		System.out.println("=================================");
		
		//findAllPage
		RowBounds bounds = new RowBounds(1, 3);
		List<DeptDTO> list4 = session.selectList("DeptMapper.findAllPage",null, bounds);
		for(DeptDTO xxx: list4) {
			System.out.println(xxx);
		}
		
		session.close();
		
		
		
		
	}
}
