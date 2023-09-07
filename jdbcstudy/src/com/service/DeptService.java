package com.service;

import java.util.List;

import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

// dept ���̺��� �����͸� �����ϴ� ���� ==> ����Ͻ� ���� ó�� �� Ʈ����� ó�� ���.
public interface DeptService {

	
	public List<DeptDTO> findAll();
	
	// DML
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException;
	public int update(DeptDTO dto);
	public int delete(int deptno);
	
	//���� �� ���� ó�� �ϴ� �޼���
	public int updateAndDelete(DeptDTO dto, int deptno);
	
	
}