package com.jsp.hibernate_one_to_one_bi.controller;

import java.time.LocalDate;

import com.jsp.hibernate_one_to_one_bi.dto.Adhar;
import com.jsp.hibernate_one_to_one_bi.dto.Person;
import com.jsp.hibernate_one_to_one_bi.service.PersonAdharService;

public class PersonAdharInsertController {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(2012, 07, 5);
		Adhar adhar=new Adhar(54342546, date, "Punjab",null);
		Person person=new Person(201,"Makhan", "m@gmail.com", adhar);
		
		PersonAdharService pas=new PersonAdharService();
		pas.savePersonAdharService(person);
	  

	}

}
