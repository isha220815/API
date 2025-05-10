package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.univ.bean.Subject;
import com.univ.service.SubjectService;

@CrossOrigin  //for react communication
@RestController  //for rest API //a server that can communicate with anybody
public class IndexController {

	@Autowired
	private SubjectService subjectServ;
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return subjectServ.getAllSubjects();
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/subjects1")
	public void addSubject(@RequestBody Subject subject) {
		subjectServ.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/subjects2/{id}")
	public void deleteSubject(@PathVariable String id) {
		subjectServ.deleteSubject("id");
	}
}
