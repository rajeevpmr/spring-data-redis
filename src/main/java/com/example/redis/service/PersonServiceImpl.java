package com.example.redis.service;

import com.example.redis.model.Person;
import com.example.redis.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;


    @Override
    public void create(Person person) {

        personRepository.save(person);

    }

    @Override
    public Optional<Person> getPersonByName(String name) {
        return personRepository.findById(name);
    }
}
