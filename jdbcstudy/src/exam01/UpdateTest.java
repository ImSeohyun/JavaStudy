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
			
			pstmt.setInt(3,12); //deptno 값 중복되지 않도록 확인할 것
			pstmt.setString(1, "개발부");
			pstmt.setString(2, "서울시");
			
			int num = pstmt.executeUpdate();
			System.out.println("레코드 생성 갯수"+num);
		

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//역순
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
