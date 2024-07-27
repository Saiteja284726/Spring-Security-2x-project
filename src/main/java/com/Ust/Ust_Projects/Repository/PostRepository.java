package com.Ust.Ust_Projects.Repository;

import com.Ust.Ust_Projects.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Project,Integer> {
}
