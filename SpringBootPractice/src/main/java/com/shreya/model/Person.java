package com.shreya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	/*
	 * @GeneratedValue(strategy=GenerationType.IDENTITY) //generate primary key
	 * automatically
	 */private int id;
private String name;
public Person (){
	
}
public Person(int id, String name) {
	
	this.id = id;
	this.name = name;
	}
public int getId() {
	return id;
	}
public void setId(int id) {
	this.id = id;
	}
public String getName() {
	return name;
	}
public void setName(String name) {
	this.name = name;
	}
}
