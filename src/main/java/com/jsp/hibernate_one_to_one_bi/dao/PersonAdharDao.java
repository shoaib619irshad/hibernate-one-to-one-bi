package com.jsp.hibernate_one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one_bi.dto.Person;

public class PersonAdharDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public Person savePersonAdharDao(Person person) 
	{
		et.begin();
		em.persist(person);
		et.commit();
		
		return person;
	}

}
