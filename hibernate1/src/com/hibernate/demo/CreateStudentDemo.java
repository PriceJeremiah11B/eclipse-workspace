package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate1.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory  factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create a session
		Session session = factory.openSession();
		
		try {
			// use the session object to save Java object
			
			// create a student object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Paul", "Wall", "paulw@luv2code.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save transaction
			System.out.println("Saving transaction...");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done...");
		}

		finally {
			factory.close();
		}
	}

}
