package com.restPostman.react.Repo;


import com.restPostman.react.Model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    @Query()
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String PostProfile, String PostDesc);
}

/*
    public void addJobs(JobPost jobPost)]]
    {
        list.add(jobPost);
    }

    public List<JobPost> getAllJobs()
    {
        return list;
    }

    public JobPost getJob(int postId) {
        for(JobPost job : list)
        {
            if(job.getId() == postId)
            {
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        boolean updated = false;

        for (JobPost job : list) {
            if (job.getId() == jobPost.getId()) {
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
                updated = true;
                break; // Exit loop after updating
            }
        }

        if (!updated) {
            throw new RuntimeException("Job with ID " + jobPost.getId() + " not found.");  // Custom message
        }
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost job : list) {
            if (job.getId() == jobPost.getId()) {
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
                new ResponseEntity<>(job, HttpStatus.OK);
                return;  // Return updated job and HTTP 200 OK
            }
        }
        new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }




    public void deleteJob(int postId) {
        list.removeIf(job -> job.getId() == postId);
    }

    public void deleteJob(int postId) {
        Iterator<JobPost> iterator = list.iterator();

        while (iterator.hasNext()) {
            JobPost jobPost = iterator.next();
            if (jobPost.getId() == postId) {
                iterator.remove();  // Safely remove the job from the list
                break;  // Exit the loop once the job is found and deleted
            }
        }
    }
 */
