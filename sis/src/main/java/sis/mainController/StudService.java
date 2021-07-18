package sis.mainController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import sis.studdata.Student;

@Service
public class StudService {
private List<Student> studs=new ArrayList<>(Arrays.asList(
		new Student(1,"Lalit","boy","sem1"),
		new Student(2,"Reena","girl","sem3"),
		new Student(3,"Ram","boy","sem5")
		));
public List<Student> showStuds(){
	return studs;
}
public Student getStudent(int rno) {
	
	return studs.stream().filter(t->t.getRno()==rno).findFirst().get();
	
	
}
public void addStudent(Student stud) {
		studs.add(stud);
}
public void updateStudent(Student stud,int rno) {
	for(int r=0;r<studs.size();r++) {if (studs.get(r).getRno()==rno) 
	                                    {studs.set(r, stud);return;}
	                                }
	
		}
public void deleteStudent(int id) {
	studs.removeIf(t->t.getRno()==id);
	
}
}
