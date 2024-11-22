package com.restPostman.react.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
@Entity
public class JobPost {
    @Id
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
