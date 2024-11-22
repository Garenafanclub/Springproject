package com.JopApp.JobPortal.Repo;

import com.JopApp.JobPortal.Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> list = new ArrayList<>();

    public JobRepo()
    {
        list.add(new JobPost("101","Intern","Java Backend Developer",2,
                List.of("Java","Spring","Hibernate")));

        list.add(new JobPost("102", "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));

        list.add(new JobPost("103", "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                        3, List.of("iOS Development", "Android Development", "Mobile App")));

        list.add(new JobPost("104", "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
                        4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));
    }

    public void addJobs(JobPost jobPost)
    {
        list.add(jobPost);
    }

    public List<JobPost> getAllJobs()
    {
        return list;
    }
}
