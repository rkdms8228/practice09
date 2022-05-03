package com.javaex.ex02;

public class Friend {

	//필드
	private String name;
	private String ph;
	private String school;
	
	//생성자
	public Friend() {
	}
	
	public Friend(String name, String ph, String school) {
		this.name = name;
		this.ph = ph;
		this.school = school;
	}
	
	//메소드-gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Friend [name=" + name + ", ph=" + ph + ", school=" + school + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: "+name+ "   핸드폰: " + ph + "   학교: " + school);
	}

}
