package com.Ust.Ust_Projects.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="personn")
public class  Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



        private Long id;
        private String psnumber;
        private String username;
        private String password;
        private String email;
        private String location;
        private boolean active;
        private String roles;





    }
