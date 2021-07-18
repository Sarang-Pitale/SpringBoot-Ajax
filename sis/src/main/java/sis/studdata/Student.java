package sis.studdata;

public class Student {
private int rno;
private String name;
private String sem;
private String gender;

public Student(int rno, String name, String gender, String sem) {
	super();
	this.rno = rno;
	this.name = name;
	this.sem = sem;
	this.gender = gender;
}

public int getRno() {
	return rno;
}

public void setRno(int rno) {
	this.rno = rno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSem() {
	return sem;
}

public void setSem(String sem) {
	this.sem = sem;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Student() {
	
}


}
