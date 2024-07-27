package com.Ust.Ust_Projects.Controller;

import com.Ust.Ust_Projects.Common.PersonConstant;
import com.Ust.Ust_Projects.Model.Person;
import com.Ust.Ust_Projects.Repository.Personrepository;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private Personrepository  personrepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String registerPerson(@RequestBody Person person){
        person.setRoles(PersonConstant.DEFAULT_ROLE);
        String encodedPassword=passwordEncoder.encode(person.getPassword());
        person.setPassword(encodedPassword);
        personrepository.save(person);
        return "person registred successfully-> "+person.getUsername();
    }
    @GetMapping("/getallperson")
    @Secured("ROLE_ADMIN")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Person> getAllPerson(){
        return personrepository.findAll();
    }


}
