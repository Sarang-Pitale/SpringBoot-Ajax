package sis.mainController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sis.studdata.Student;

@RestController
public class MainController {
@Autowired
private	StudService sserv;
@RequestMapping(method=RequestMethod.GET,value="/students")
public List<Student> showStudents(){
return sserv.showStuds();			
}
@RequestMapping("/students/{id}")
public Student getStudents(@PathVariable int id){
return sserv.getStudent(id);
}
@RequestMapping(method=RequestMethod.POST,value="/students")
public void addStudents(@RequestBody Student stud){
sserv.addStudent(stud)		;
}
@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
public void addStudents(@RequestBody Student stud,@PathVariable int id){
sserv.updateStudent(stud,id)		;
}
@RequestMapping(method=RequestMethod.DELETE,value="/students/{id}")
public void deleteStudents(@PathVariable int id){
sserv.deleteStudent(id)		;
}
@RequestMapping("/hi")
public String greet(){
return "hi";
}



}
