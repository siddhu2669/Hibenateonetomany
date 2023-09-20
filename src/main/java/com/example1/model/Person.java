package com.example1.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Persons")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="person_id")
	private int id;
	
	@Column(name="person_name")
	private String person_name;

	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private Passport details;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String person_name, Passport details) {
		super();
		this.id = id;
		this.person_name = person_name;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public Passport getDetails() {
		return details;
	}

	public void setDetails(Passport details) {
		this.details = details;
	}


}
