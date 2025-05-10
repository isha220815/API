package com.univ.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.bean.Subject;
import com.univ.repository.SubjectRepo;

@Service
public class SubjectService {


	@Autowired
	public SubjectRepo subjectRepo;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjects=new ArrayList<Subject>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
	}
	
	public void updateSubject(String id,Subject subject) {
		subjectRepo.save(subject);
	}
	
	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
	}
}
