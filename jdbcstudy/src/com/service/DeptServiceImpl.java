package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

public class DeptServiceImpl implements DeptService {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";

	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// select ����ϴ� �޼���
	// Connection ������ ��´�. ������ �۾��� DAO���� ó��
	@Override
	public List<DeptDTO> findAll() {

		List<DeptDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO ����
			DeptDAO dao = new DeptDAO();
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

	// insert ����ϴ� �޼���
    // Connection ������ ��´�. ������ �۾��� DAO���� ó��
	@Override
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
	        // DAO ����
			DeptDAO dao = new DeptDAO();
			n = dao.insert(con, dto);
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

	// update ����ϴ� �޼���
    // Connection ������ ��´�. ������ �۾��� DAO���� ó��
	@Override
	public int update(DeptDTO dto) {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO ����
			DeptDAO dao = new DeptDAO();
			n = dao.update(con, dto);
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
	public int delete(int deptno) {
		Connection con = null;
		int n=0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAO dao = new DeptDAO();
			n=dao.delete(con,deptno);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int updateAndDelete(DeptDTO dto, int deptno) {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO ����
			DeptDAO dao = new DeptDAO();
			////////Ʈ�����
			/*
			 * �� �� �����ؼ� ���� DB �ݿ� --commit
			 * �Ǵ�
			 * �� �� �ϳ��� �����Ͽ� ��� ��� -- rollback
			 */
			con.setAutoCommit(false);//�ڵ� Ŀ�� ��Ȱ��ȭ
			//����
			n = dao.update(con, dto);
			
			//����
			n = dao.delete(con, deptno);
			con.commit();
		} catch (SQLException e) {
			try {
				if(con!=null)con.rollback();	
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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

}





