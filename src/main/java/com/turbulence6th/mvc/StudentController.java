package com.turbulence6th.mvc;

public class StudentController {

	Student model;
	
	StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public void updateView() {
		view.printStudentDetails(model.getId(), model.getName());
	}
	
}
