package com.turbulence6th.mvc;

import org.junit.Test;

public class MVCTest {

	@Test
	public void testMVC() {
		StudentRepository studentRepository = new StudentRepository();
		Student student = studentRepository.getStudent();
		StudentView studentView = new StudentView();
		StudentController studentController = new StudentController(student, studentView);
		studentController.updateView();
		studentController.setStudentName("test");
		studentController.updateView();
	}
	
}
