package com.JobPortal.JobApp.Controller;

import com.JobPortal.JobApp.Model.JobPost;
import com.JobPortal.JobApp.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    // Show the homepage
    @GetMapping({"/","home"})
    public String viewHomePage() {
        return "home";
    }

    // Show the "Add Job" form
    @GetMapping("/addjob")
    public String addjob(Model model) {
        model.addAttribute("jobPost", new JobPost());
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleAddJob(@ModelAttribute("jobPost") JobPost jobPost) {
        jobService.addjobPost(jobPost);
        return "redirect:/viewalljobs";
    }

    // View all job posts
    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model) {
        List<JobPost> jobPosts = jobService.returnalljobPost();  // Get the list of all jobs from the service
        model.addAttribute("jobPosts", jobPosts);  // Pass the job posts to the view
        return "viewalljobs";
    }
}
