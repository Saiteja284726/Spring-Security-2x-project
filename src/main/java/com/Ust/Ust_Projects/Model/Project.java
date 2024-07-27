package com.Ust.Ust_Projects.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="projectt")
public class Project {

    @Id
    private int projectId;
    private String projectname;
    private String projectdescription;
    private String projectLink;
    private String psnumber;
    private String username;
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;





}
