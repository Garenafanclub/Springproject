package com.restPostman.react.Controller;

import com.restPostman.react.Model.JobPost;
import com.restPostman.react.Service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private jobService jobService;

    @GetMapping("jobPosts")
    @ResponseBody   // or use @RestController
    public List<JobPost> getAllJobs()
    {
        return jobService.viewAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId)
    {
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost)
    {
         jobService.addjob(jobPost);
         return jobService.getJob(jobPost.getId());  // used for debugging purpose...
    }

    @GetMapping("jobPost/keyword/{keyword}")
    public List<JobPost> SearchByKeyword(@PathVariable("keyword") String keyword)
    {
       return jobService.search(keyword);
    }

    @PutMapping("jobPost")
    public  JobPost updateJob(@RequestBody JobPost jobPost)
    {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getId());
    }

    @DeleteMapping("jobPost/{postId}")
    public ResponseEntity<String> deleteJob(@PathVariable() int postId)
    {
        JobPost jobPost = jobService.getJob(postId);
        if (jobPost == null) {
            return new ResponseEntity<>("Job post not found", HttpStatus.NOT_FOUND);
        }
        jobService.deleteJob(postId);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @GetMapping("load")
    public String loadData()
    {
        jobService.loadAllJob();
        return "Success";
    }
}
