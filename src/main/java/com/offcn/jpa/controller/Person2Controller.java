package com.offcn.jpa.controller;

import com.offcn.jpa.dao.PersonRepository;
import com.offcn.jpa.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/person2")
public class Person2Controller {
    @Autowired
    private PersonRepository personRepository;
    @GetMapping("findByName/{name}")
    public Person findByName(@PathVariable String name){
        return personRepository.findByNameIs(name);
    }
    @GetMapping("findByNameIsAndAge/{name}/{age}")
    public Person findByNameIsAndAge(@PathVariable String name, @PathVariable Integer age){

        return personRepository.findByNameIsAndAge(name,age);
    }
}
