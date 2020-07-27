package com.offcn.jpa.controller;

import com.offcn.jpa.dao.PersonRepository;
import com.offcn.jpa.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @PostMapping(path = "addPerson")
    public void addPerson(@RequestBody Person person){
        personRepository.save(person);
    }
    @GetMapping(path="getAllPerson")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }
    @DeleteMapping(path = "deletePerson")
    public void deletePerson(@RequestParam Long id){
        personRepository.deleteById(id);
    }
    @PutMapping(path = "updatePerson")
    public void updatePerson(@RequestBody Person person){
        personRepository.saveAndFlush(person);
    }
}
