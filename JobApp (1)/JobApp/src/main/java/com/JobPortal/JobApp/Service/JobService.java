package com.JobPortal.JobApp.Service;

import com.JobPortal.JobApp.Model.JobPost;
import com.JobPortal.JobApp.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;

    public void addjobPost(JobPost jobPost)
    {
        jobRepo.addjob(jobPost);
    }

    public List<JobPost> returnalljobPost()
    {
        return jobRepo.returnalljobPost();
    }
}
