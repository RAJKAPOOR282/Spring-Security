package ClassSpringBootSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ClassSpringBootSecurity.model.StudentBean;
import ClassSpringBootSecurity.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentSecurity")
	public String disp() {
		return "Demo Student security rest api..";
	}
	
	@GetMapping("/allstudents")
	public List<StudentBean> getStudents() {

		List<StudentBean> students = new ArrayList<>();
		students.add(new StudentBean(1 , "Raj kapoor" ,"raj@gmail.com" , "raj@12" ));
		students.add(new StudentBean(2 , "Shamshad Alam" , "shamshad@gmail.com" , "raj@123"));
		students.add(new StudentBean(3 , "Wahab khan" , "wahab@gmail.com" , "raj@1234"));
		students.add(new StudentBean(4 , "Sunil Kumar" , "sunil@gmail.com" , "raj@12345"));
		
		return studentService.createallStudent(students);
	}
	
	@PostMapping("/student")
	public StudentBean createStudent(@RequestBody StudentBean student) {
		return studentService.createStudent(student);
	}
	
}

