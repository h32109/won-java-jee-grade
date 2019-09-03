package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name,ssn, hakbun,kor, eng, math, society,total, aver;
	
	public String getName() {
		return name;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getAver() {
		return aver;
	}
	public void setAver(String aver) {
		this.aver = aver;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}


	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", ssn=" + ssn + ", hakbun=" + hakbun + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", society=" + society + ", total=" + total + ", aver=" + aver + "]";
	}
	
}
