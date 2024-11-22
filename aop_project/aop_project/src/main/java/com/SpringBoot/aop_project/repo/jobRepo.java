package com.SpringBoot.aop_project.repo;

import com.SpringBoot.aop_project.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface jobRepo extends JpaRepository<JobPost,Integer> {
    @Query()
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String PostProfile, String PostDesc);
}
