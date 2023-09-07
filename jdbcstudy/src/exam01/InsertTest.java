package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String pwd = "TIGER";

		try{
		     Class.forName(driver);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			con = DriverManager.getConnection(url,userid, pwd);
			
			String sql = "insert into dept( deptno, dname, loc) "
						+" values( ?, ?, ?)"; //?�� ���ε� �����μ� ���߿� �� ����
			
			pstmt = con.prepareStatement(sql);
			//?��ſ� �� �����ϱ�
			/*
			 * 	pstmt.setXXX(?�� ��ġ, ��);
			 */
			
			pstmt.setInt(1,11);
			pstmt.setString(2, "����");
			pstmt.setString(3, "����");
			
			int num = pstmt.executeUpdate();
			System.out.println("���ڵ� ���� ����"+num);
		

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//����
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	
	}
}
