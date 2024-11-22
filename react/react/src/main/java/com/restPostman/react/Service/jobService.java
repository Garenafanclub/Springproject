package com.restPostman.react.Service;


import com.restPostman.react.Model.JobPost;
import com.restPostman.react.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class jobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobPost> viewAllJobs()
    {
        return jobRepo.findAll();
    }

    public void addjob(JobPost jobPost)
    {
         jobRepo.save(jobPost);
    }

    public JobPost getJob(int postId) {
        return jobRepo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public void loadAllJob() {
        List<JobPost> list = new ArrayList<>(List.of(
                new JobPost(101, "Intern", "Java Backend Developer", 2, List.of("Java", "Spring", "Hibernate")),
                new JobPost(102, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React")),
                new JobPost(103, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, List.of("iOS Development", "Android Development", "Mobile App")),
                new JobPost(104, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes"))
        ));
        jobRepo.saveAll(list);
    }

    public List<JobPost> search(String keyword) {
         return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
