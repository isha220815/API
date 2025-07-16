package com.univ.bean;

public class Student {
private int sid;
private String sname;
private int fees;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
}


}
