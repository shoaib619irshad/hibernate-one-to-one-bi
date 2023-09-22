package com.jsp.hibernate_one_to_one_bi.service;

import com.jsp.hibernate_one_to_one_bi.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one_bi.dto.Person;

public class PersonAdharService {
	
	PersonAdharDao personAdharDao=new PersonAdharDao();
	
	public Person savePersonAdharService(Person person) 
	{
		return personAdharDao.savePersonAdharDao(person);
	}

}
