package com.JopApp.JobPortal.Service;

import com.JopApp.JobPortal.Model.JobPost;
import com.JopApp.JobPortal.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobPost> viewAllJobs()
    {
        return jobRepo.getAllJobs();
    }

    public void addjob(JobPost jobPost)
    {
         jobRepo.addJobs(jobPost);
    }
}









