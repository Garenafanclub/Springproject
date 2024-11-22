package com.JopApp.JobPortal.Controller;

import com.JopApp.JobPortal.Model.JobPost;
import com.JopApp.JobPortal.Service.jobService;
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
    private jobService service;

    @GetMapping({"/","home"})
    public String home()
    {
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob(Model model)
    {
        model.addAttribute("jobPost", new JobPost());
        return "addjob";
    }


    @PostMapping("/handleForm")
    public String handleTheData(@ModelAttribute("jobPost") JobPost jobPost, Model model)
    {
        model.addAttribute("id", jobPost.getId());
        model.addAttribute("postProfile", jobPost.getPostProfile());
        model.addAttribute("postDesc", jobPost.getPostDesc());
        model.addAttribute("reqExperience", jobPost.getReqExperience());
        model.addAttribute("postTechStack", jobPost.getPostTechStack());
        service.addjob(jobPost);
        return "success";
    }


    @GetMapping("/viewalljobs")
    public String viewAllJob(Model model)
    {
        List<JobPost> jobs = service.viewAllJobs();
        model.addAttribute("jobs",jobs);
        return "viewalljobs";
    }
}

/*
     @PostMapping("/handleForm")
     public String handleTheData(@ModelAttribute("jobPost") jobPost jobPost, Model model)
     {
             model.addAttribute("job", jobPost);
             return "success";
     }
 */
