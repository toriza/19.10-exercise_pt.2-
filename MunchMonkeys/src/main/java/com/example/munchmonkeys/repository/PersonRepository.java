package com.example.munchmonkeys.repository;

import com.example.munchmonkeys.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public class PersonRepository extends JpaRepository<Person, Long> {
}
