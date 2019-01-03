package com.example.redis.controller;

import com.example.redis.model.Person;
import com.example.redis.service.PersonService;
import com.example.redis.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {


    @Autowired
    PersonService personService;

    @RequestMapping(value = "/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_HTML_VALUE)
    public @ResponseBody String createPerson(@RequestBody Person person){

        personService.create(person);
        return "Success";
    }

}
