package com.gaurav.entity;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("EMPL");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee a= new Employee();
	
		a.setId(106);
		a.setName("Sumit");
		a.setSalary(11000);
		em.persist(a);			
		
		
		em.getTransaction().commit();
			
		em.close();
		emf.close();
		
		
		System.out.println("Transaction Successfull");

	}

}
