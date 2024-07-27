package com.Ust.Ust_Projects.Service;

import com.Ust.Ust_Projects.Model.Person;
import com.Ust.Ust_Projects.Repository.Personrepository;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupUserDetailsService implements UserDetailsService {

    @Autowired
    private Personrepository repository;

    @Override
    public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException{
        Optional<Person>user = repository.findByUsername(Username);
        return user.map(GroupUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException(Username+"Notfound"));

    }
}
