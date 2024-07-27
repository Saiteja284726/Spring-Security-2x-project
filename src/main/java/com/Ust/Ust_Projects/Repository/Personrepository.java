package com.Ust.Ust_Projects.Repository;

import com.Ust.Ust_Projects.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Personrepository extends JpaRepository<Person,Long> {
    Optional<Person> findByUsername(String username);

}
