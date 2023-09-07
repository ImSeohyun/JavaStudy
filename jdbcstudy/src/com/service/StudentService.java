package com.service;

import java.util.List;

import com.dto.StudentDTO;
import com.dto.StudentPointDTO;

// dept 테이블의 데이터를 가공하는 역할 ==> 비즈니스 로직 처리 및 트랜잭션 처리 담당.
public interface StudentService {
	
	public List<StudentDTO> findAll();
	
	public List<StudentDTO> search(String name);
	public List<StudentDTO> searchD(int d1, int d2);
	public List<StudentDTO> searchNo(String[] arr);
	public List<StudentPointDTO> searchP(String name);
	
	public int updateAbs(String[] s);
	public int updateCapa();
	
}