package com.grade.web.services;

import com.grade.web.domains.StudentBean;

public interface StudentService {
	public void createStudent(StudentBean param);
	public String createHakbun(StudentBean param);
	public String createYear();
	public String createaver(StudentBean param);
	public String createtotal(StudentBean param);
}
