package com.shreya.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shreya.model.Person;
import com.shreya.repository.*;

@Service
public class PersonService {
@Autowired
private PersonRepository personrepository;

public List getAllPersons(){ 
List person=new ArrayList(); 
personrepository.findAll().forEach(person::add);
return person;
	}

public void addPerson(Person person) {
	personrepository.save(person);
	}
}
