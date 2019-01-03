package com.example.redis.service;

import com.example.redis.model.Person;

import java.util.Optional;

public interface PersonService {

    public void create(Person person);
    public Optional<Person> getPersonByName(String name);

}
