package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1,"Learn sql noww","Tusharaaa"));
		repository.save(new Course(2,"Learn azure","Tusharaaa"));
		repository.save(new Course(3,"Learn h2","Tusharaaa"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());	
		
		System.out.println(repository.findByAuthor("Tusharaaa"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn h2"));
		
	}
	
	

}
