package com.cg.client;

import com.cg.entities.Certificate;
import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		
		student.setId(12);
		student.setRoll(101);
		student.setQualification("BE");
		student.setCourse("IT");
		student.setYear(2021);
		student.setHallTicketNo(10101);
		
		
		Certificate certificate=new Certificate();
		certificate.setCert_id(1235);
		certificate.setYear(2022);
		
		//oneToOne bidirectional
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		//adding a data
		//service.addStudent(student);
		
		//Retrieving a data
		service.searchStudentById(12);
		System.out.println("Id is: "+student.getId());
		System.out.println("Id is: "+student.getCourse());

		
		System.out.println("Data is updated");
		
		

		
		



	}

}
