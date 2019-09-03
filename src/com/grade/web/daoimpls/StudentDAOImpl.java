package com.grade.web.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.StudentDAO;
import com.grade.web.domains.StudentBean;

public class StudentDAOImpl implements StudentDAO {
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjava-grade%sWebContent%sresources%stxt%s",
							File.separator,
							File.separator,
							File.separator,
							File.separator,
							File.separator,
							File.separator,
							File.separator,
							File.separator
			);

	@Override
	public void insertStudent(StudentBean param) {
		try {
			File file = new File(FILE_PATH + "student.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s  %s  %s  %s  %s  %s  %s  %s  %s", 
					param.getName(),
					param.getSsn(),
					param.getHakbun(),
					param.getKor(),
					param.getEng(),
					param.getMath(),
					param.getSociety(),
					param.getTotal(),
					param.getAver()));
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(param.toString());
	}

}
