package com.example1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passports")

public class Passport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="passport_id")
	private int id;
	
	@Column(name="details")
	private String details;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private Person user;

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passport(int id, String details, Person user) {
		super();
		this.id = id;
		this.details = details;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Person getUser() {
		return user;
	}

	public void setUser(Person user) {
		this.user = user;
	}


}
