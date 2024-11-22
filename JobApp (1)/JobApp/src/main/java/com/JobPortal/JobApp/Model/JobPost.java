package com.JobPortal.JobApp.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.util.List;

@Setter
@Getter
@Component
public class JobPost {

    private int id;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public JobPost() {}

    public JobPost(int id, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.id = id;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

}

