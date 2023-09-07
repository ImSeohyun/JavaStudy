package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTest {

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
			
			String sql = "update dept set dname=? ,loc=? where deptno=? ";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(3,12); //deptno �� �ߺ����� �ʵ��� Ȯ���� ��
			pstmt.setString(1, "���ߺ�");
			pstmt.setString(2, "�����");
			
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
