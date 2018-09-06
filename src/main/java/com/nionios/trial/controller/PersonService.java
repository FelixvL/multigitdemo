package com.nionios.trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nionios.trial.domain.Person;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    /*
        public Person updatePerson(Person person, Long id, String field) {
           return personRepository.findById(id).get().
        }
    */
    public Person findById(Long id) {
        return personRepository.findById(id).get();
    }

    public Iterable<Person> findAll() {
        Iterable<Person> result = personRepository.findAll();
        return result;
    }
}
