package com.service;

import java.util.List;

import com.dto.StudentDTO;
import com.dto.StudentPointDTO;

// dept ���̺��� �����͸� �����ϴ� ���� ==> ����Ͻ� ���� ó�� �� Ʈ����� ó�� ���.
public interface StudentService {
	
	public List<StudentDTO> findAll();
	
	public List<StudentDTO> search(String name);
	public List<StudentDTO> searchD(int d1, int d2);
	public List<StudentDTO> searchNo(String[] arr);
	public List<StudentPointDTO> searchP(String name);
	
	public int updateAbs(String[] s);
	public int updateCapa();
	
}