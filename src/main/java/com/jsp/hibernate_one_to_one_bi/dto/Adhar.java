package com.jsp.hibernate_one_to_one_bi.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adhar {
	
	@Id
	private long adharNumber;
	private LocalDate adharDob;
	private String adharAddress;
	
	
	@OneToOne(mappedBy = "adhar")
	private Person person;

}
