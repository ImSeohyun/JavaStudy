package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

// Oracle�� dept���̺� �����ϴ� Ŭ����
public class DeptDAO {

	// select ����ϴ� �޼���
	public List<DeptDTO> findAll(Connection con) {
		// DeptDTO ������
		List<DeptDTO> list = new ArrayList<DeptDTO>();// ������
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select deptno as no, dname, loc from dept";
			pstmt = con.prepareStatement(sql); // �����߻���
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt("no"); // getInt(1) ����
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				// ����
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// ����
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}//

	// insert �۾�
	public int insert(Connection con, DeptDTO dto) throws DuplicatedDeptnoException {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into dept ( deptno, dname, loc) " + " values( ?, ?, ? )";
			pstmt = con.prepareStatement(sql); // �����߻���
			pstmt.setInt(1, dto.getDeptno()); // deptno ���� �ߺ����� �ʵ��� Ȯ���� ��.
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
//	    	e.printStackTrace();
			throw new DuplicatedDeptnoException(dto.getDeptno() + " ���� �ߺ���");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return num;
	}

	public int update(Connection con, DeptDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update dept set dname=?, loc=? where deptno=?"; // ?�� ���ε� �����μ� ���߿� ���� �����Ѵ�.
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, dto.getDeptno()); // deptno ���� �ߺ����� �ʵ��� Ȯ���� ��.
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}

	public int delete(Connection con, int deptno) {
		PreparedStatement pstmt = null;

		int n =0;
		try {
			String sql = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) //���� �� ���� null�̹Ƿ� null�� �ƴҶ��� close����
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}
}