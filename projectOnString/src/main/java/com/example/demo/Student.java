package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
  
	 
	ElectronicDevice ref;
	void study() {
		System.out.println("Student is writing");
	}
	
	void workingWithDevice() {
		ref.useDevice();
	}

	public Student(@Qualifier("mob") ElectronicDevice ref) {
		super();
		this.ref = ref;
	}
 
	
	
}
