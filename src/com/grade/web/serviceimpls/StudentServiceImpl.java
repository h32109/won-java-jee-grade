package com.grade.web.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.grade.web.daoimpls.StudentDAOImpl;
import com.grade.web.daos.StudentDAO;
import com.grade.web.domains.StudentBean;
import com.grade.web.services.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	
	public StudentServiceImpl() {
		dao = new StudentDAOImpl();
	}

	@Override
	public void createStudent(StudentBean param) {
		param.setAver(createaver(param));
		param.setTotal(createtotal(param));
		param.setHakbun(createHakbun(param));
		System.out.println(param.toString());
		dao.insertStudent(param);
	}

	@Override
	public String createHakbun(StudentBean param) {
		Random ran = new Random();
		String temp = String.format("%s-%s%03d" , 
				createYear(),
				param.getSsn().substring(7,8),
				ran.nextInt(999)+1) ;
		return temp;
	}

	@Override
	public String createYear() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		return sdf.format(new Date());
	}

	@Override
	public String createaver(StudentBean param) {
		
		String aver = String.valueOf((Integer.parseInt(param.getEng())
		+Integer.parseInt(param.getKor())
		+Integer.parseInt(param.getMath())
		+Integer.parseInt(param.getSociety()))/4);
		return aver;
	}

	@Override
	public String createtotal(StudentBean param) {
		String total = String.valueOf(Integer.parseInt(param.getEng())
				+Integer.parseInt(param.getKor())
				+Integer.parseInt(param.getMath())
				+Integer.parseInt(param.getSociety()));
		return total;
	}
	
	

}
