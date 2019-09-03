package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.StudentBean;
import com.grade.web.serviceimpls.StudentServiceImpl;
import com.grade.web.services.StudentService;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String kor  = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		String society = request.getParameter("society");
		StudentBean param = new StudentBean();
		param.setName(name);
		param.setMath(math);
		param.setEng(eng);
		param.setKor(kor);
		param.setSociety(society);
		param.setSsn(ssn);
		StudentService service = new StudentServiceImpl();
		service.createStudent(param);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
