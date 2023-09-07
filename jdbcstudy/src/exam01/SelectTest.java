package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
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
			String sql = "select deptno as no, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("no");
				String dname =rs.getString("dname");
				//String dname =rs.getString(2); //컬럼 순서로 지정				
				String loc =rs.getString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}

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
