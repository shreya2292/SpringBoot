package com.shreya.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.shreya.model.Person;
import com.shreya.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personservice;
	
@GetMapping("/person")	// we are trying to get the person details
 public List <Person> getAllPerson(){
	 return personservice.getAllPersons();
 	}
@PostMapping("/person")
public void addPerson(@RequestBody Person person) {
	personservice.addPerson(person);
	}
}

