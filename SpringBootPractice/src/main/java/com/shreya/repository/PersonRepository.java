package com.shreya.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shreya.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}


