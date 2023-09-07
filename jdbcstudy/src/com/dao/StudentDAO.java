package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DeptDTO;
import com.dto.StudentDTO;
import com.dto.StudentPointDTO;

// Oracle의 student테이블 연동하는 클래스
public class StudentDAO {

	// select 기능하는 메서드
	public List<StudentDTO> findAll(Connection con) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();// 다형성
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no, student_name, \r\n"
					+ "      substr(student_ssn,1,8)||'*******' as student_ssn,\r\n"
					+ "      substr(student_address,1,10)||'...' as student_address, \r\n"
					+ "      to_char(ENTRANCE_DATE,'YYYY/MM/DD') as entrance_date,\r\n"
					+ "      ABSENCE_YN, DEPARTMENT_NO, COACH_PROFESSOR_NO\r\n" + "from tb_student";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("student_no");
				String stuName = rs.getString("student_name");
				String stuSsn = rs.getString("student_ssn");
				String stuAddress = rs.getString("student_address");
				String entDate = rs.getString("ENTRANCE_DATE");
				// char은 어케 받지?
				char absYn = rs.getString("ABSENCE_YN").charAt(0);
				String departNo = rs.getString("DEPARTMENT_NO");
				String coachProfessorNo = rs.getString("COACH_PROFESSOR_NO");

				StudentDTO dto = new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, absYn, coachProfessorNo);
				// 누적
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<StudentDTO> search(Connection con, String name) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();// 다형성
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no, student_name, \r\n"
					+ "      substr(student_ssn,1,8)||'*******' as student_ssn,\r\n"
					+ "      case when student_address is null then '***주소 미상***'\r\n"
					+ "        else substr(student_address,1,10)||'...' end as student_address,\r\n"
					+ "      to_char(ENTRANCE_DATE,'YYYY/MM/DD') as entrance_date, \r\n" + "      ABSENCE_YN\r\n"
					+ "from tb_student\r\n" + "where student_name like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("student_no");
				String stuName = rs.getString("student_name");
				String stuSsn = rs.getString("student_ssn");
				String stuAddress = rs.getString("student_address");
				String entDate = rs.getString("ENTRANCE_DATE");
				char absYn = rs.getString("ABSENCE_YN").charAt(0);

				StudentDTO dto = new StudentDTO(stuNo, stuName, stuSsn, stuAddress, entDate, absYn);
				// 누적
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<StudentDTO> searchD(Connection con, int d1, int d2) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();// 다형성
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no, student_name, \r\n"
					+ "      substr(student_ssn,1,8)||'*******' as student_ssn,\r\n"
					+ "      case when student_address is null then '***주소 미상***'\r\n"
					+ "        else substr(student_address,1,10)||'...' end as student_address,\r\n"
					+ "      to_char(ENTRANCE_DATE,'YYYY/MM/DD') as entrance_date, \r\n" + "      ABSENCE_YN\r\n"
					+ "from tb_student\r\n" + "where ENTRANCE_DATE >= TO_DATE(?,'YYYY/MM/DD') \r\n"
					+ "AND ENTRANCE_DATE <= TO_DATE(?,'YYYY/MM/DD')\r\n" + "ORDER BY ENTRANCE_DATE\r\n";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, d1 + "/01/01");
			pstmt.setString(2, d2 + "/12/31");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("student_no");
				String stuName = rs.getString("student_name");
				String stuSsn = rs.getString("student_ssn");
				String stuAddress = rs.getString("student_address");
				String entDate = rs.getString("ENTRANCE_DATE");
				char absYn = rs.getString("ABSENCE_YN").charAt(0);

				StudentDTO dto = new StudentDTO(stuNo, stuName, stuSsn, stuAddress, entDate, absYn);
				// 누적
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<StudentDTO> searchNo(Connection con, String[] arr) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();// 다형성
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no, student_name, \r\n"
					+ "      substr(student_ssn,1,8)||'*******' as student_ssn,\r\n"
					+ "      case when student_address is null then '***주소 미상***'\r\n"
					+ "        else substr(student_address,1,10)||'...' end as student_address,\r\n"
					+ "      to_char(ENTRANCE_DATE,'YYYY/MM/DD') as entrance_date, \r\n" + "      ABSENCE_YN\r\n"
					+ "from tb_student \r\n" + "where STUDENT_NO = ?";
			for (int i = 1; i < arr.length; i++) {
				sql += "or student_no = ?";
			}

			pstmt = con.prepareStatement(sql);
			for (int i = 0; i < arr.length; i++) {
				pstmt.setString(i + 1, arr[i]);
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("student_no");
				String stuName = rs.getString("student_name");
				String stuSsn = rs.getString("student_ssn");
				String stuAddress = rs.getString("student_address");
				String entDate = rs.getString("ENTRANCE_DATE");
				char absYn = rs.getString("ABSENCE_YN").charAt(0);

				StudentDTO dto = new StudentDTO(stuNo, stuName, stuSsn, stuAddress, entDate, absYn);
				// 누적
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public int updateAbs(Connection con, String[] s) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update TB_STUDENT \r\n" + "set ABSENCE_YN ='Y'\r\n" + "where STUDENT_NO in (?";
			for (int i = 1; i < s.length; i++) {
				sql += ",?";
			}
			sql += ")";
			System.out.println("sql-- " + sql);
			pstmt = con.prepareStatement(sql);
			for (int i = 0; i < s.length; i++) {
				pstmt.setString(i + 1, s[i]);
			}
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

	public int updateCapa(Connection con) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update TB_DEPARTMENT\r\n" + "set CAPACITY = \r\n" + "case \r\n"
					+ "when capacity BETWEEN 0 and 20 then capacity+5\r\n"
					+ "when capacity BETWEEN 21 and 25 then capacity+4\r\n"
					+ "when capacity BETWEEN 26 and 30 then capacity+3\r\n" + "else capacity end";
			pstmt = con.prepareStatement(sql);
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

	public List<StudentPointDTO> searchP(Connection con, String name) {
		List<StudentPointDTO> list = new ArrayList<StudentPointDTO>();// 다형성
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select g.TERM_NO, STUDENT_NO, s.STUDENT_NAME, class_name, g.POINT as point,\r\n" + 
					"case \r\n" + 
					"when point BETWEEN 0 and 1.9 then 'F 학점'\r\n" + 
					"when point BETWEEN 2.0 and 2.9 then 'D 학점'\r\n" + 
					"when point BETWEEN 3.0 and 3.4 then 'C 학점'\r\n" + 
					"when point BETWEEN 3.5 and 3.9 then 'B 학점'\r\n" + 
					"else 'A 학점' end as 학점\r\n" + 
					"from tb_grade g join TB_STUDENT s using(student_no)\r\n" + 
					"                join TB_CLASS using(CLASS_NO)\r\n" + 
					"where student_no = ? order by 1";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String termNo = rs.getString("TERM_NO");
				String stuNo = rs.getString("STUDENT_NO");
				String stuName = rs.getString("STUDENT_NAME");
				String cName = rs.getString("class_name");
				String point = rs.getString("POINT");
				String grade = rs.getString("학점");

				StudentPointDTO dto = new StudentPointDTO(termNo, stuNo, stuName, cName, point, grade);
				// 누적
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}