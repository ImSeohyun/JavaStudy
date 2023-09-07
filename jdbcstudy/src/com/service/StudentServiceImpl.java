package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.dto.StudentPointDTO;

public class StudentServiceImpl implements StudentService {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "workshop";
	String passwd = "workshop";

	public StudentServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// select 기능하는 메서드
	// Connection 까지만 얻는다. 나머지 작업은 DAO에서 처리
	@Override
	public List<StudentDTO> findAll() {

		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 접근
			StudentDAO dao = new StudentDAO();
			list = dao.findAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<StudentDTO> search(String name) {

		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 접근
			StudentDAO dao = new StudentDAO();
			list = dao.search(con, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public List<StudentDTO> searchD(int d1, int d2) {
		
		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 접근
			StudentDAO dao = new StudentDAO();
			list = dao.searchD(con, d1,d2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public List<StudentDTO> searchNo(String[] arr) {

		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 접근
			StudentDAO dao = new StudentDAO();
			list = dao.searchNo(con, arr);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public int updateAbs(String[] s) {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 연동
			StudentDAO dao = new StudentDAO();
			n = dao.updateAbs(con, s);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return n;
	}
	
	@Override
	public int updateCapa() {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 연동
			StudentDAO dao = new StudentDAO();
			n = dao.updateCapa(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return n;
	}
	
	@Override
	public List<StudentPointDTO> searchP(String name) {

		List<StudentPointDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 접근
			StudentDAO dao = new StudentDAO();
			list = dao.searchP(con, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	

}





