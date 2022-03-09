package com.gaurav;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mainexicution {

	public static void main(String[] args) {

		EntityManagerFactory fc= Persistence.createEntityManagerFactory("JPA_Single_Inheritance");
		EntityManager em=fc.createEntityManager();
		em.getTransaction().begin();
		
		Empolyee emp= new Empolyee();
		emp.setName("RaJ");
		emp.setSalary(10000);
		em.persist(emp);
		
		
	 Manager man= new Manager();
	 man.setName("Shyam");
	 man.setSalary(40000);
	 man.setDepartment("MR");
		em.persist(man);

		em.getTransaction().commit();
		
		em.close();
		fc.close();
		
	}

}
