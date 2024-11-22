package com.JopApp.JobPortal.Model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
public class JobPost {
    private String id;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public JobPost() {}

    public JobPost(String id, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.id = id;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    @Override
    public String toString() {
        return "jobPost{" +
                "id='" + id + '\'' +
                ", postProfile='" + postProfile + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", reqExperience=" + reqExperience +
                ", postTechStack=" + postTechStack +
                '}';
    }
}
