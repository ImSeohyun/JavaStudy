package com.exception;


// ����� ���� ���� Ŭ���� ==> ���ܹ߻��� try~catch �Ǵ� throws �� ����� �� �ִ�.
public class DuplicatedDeptnoException extends Exception{

	// �ʿ�� ����, �޼��� �߰� ����
	
	public DuplicatedDeptnoException(String message) {
		super(message);
	}
}