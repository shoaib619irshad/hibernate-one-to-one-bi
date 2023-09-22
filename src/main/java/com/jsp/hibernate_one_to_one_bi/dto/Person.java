package com.jsp.hibernate_one_to_one_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	@Id
	private int personId;
	private String personName;
	private String personEmail;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="adharNumber")
	private Adhar adhar;


}
