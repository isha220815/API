package com.univ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.univ.bean.Employee;
import com.univ.bean.Student;

@Configuration
public class StudentConfig {

	@Bean
	public Student getData() {
		Student d1=new Student();
		d1.setSid(1);
		d1.setSname("Isha");
		d1.setFees(70000);
		return d1;
	}
	
	@Bean
	public Employee fetch() {
		Employee emp=new Employee();
		emp.setEid(101);
		emp.setEname("Parth");
		emp.setCity("Indore");
		emp.setSalary(900000);
		return emp;
	}
}
