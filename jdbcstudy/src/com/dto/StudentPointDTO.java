package com.dto;

public class StudentPointDTO {

	String termNo; //학기
	String stuNo; //학번
	String stuName; //이름
	String cName; //과목명
	String point; //점수
	String grade; //학점
	
	public StudentPointDTO() {}

	
	public StudentPointDTO(String termNo, String stuNo, String stuName, String cName, String point, String grade) {
		this.termNo = termNo;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.cName = cName;
		this.point = point;
		this.grade = grade;
	}
	
	public String getTermNo() {
		return termNo;
	}


	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}


	public String getStuNo() {
		return stuNo;
	}


	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getPoint() {
		return point;
	}


	public void setPoint(String point) {
		this.point = point;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return termNo + "\t"+ stuNo + "\t" + stuName + "\t" + cName
				+ "\t" + point + "\t" + grade;
	};
	
	
}
