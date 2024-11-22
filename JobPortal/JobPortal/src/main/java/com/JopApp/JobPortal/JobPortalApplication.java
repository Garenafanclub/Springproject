package com.JopApp.JobPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}
}


/*
 <form th:action="@{/handleForm}" method="post">
                <div class="mb-3">
                    <label for="postProfile" class="form-label">Job Position</label>
                    <input type="text" class="form-control" id="postProfile" name="postProfile" required>
                </div>
                <div class="mb-3">
                    <label for="postDesc" class="form-label">Job Description</label>
                    <textarea class="form-control" id="postDesc" name="postDesc" rows="3" required></textarea>
                </div>
                <div class="mb-3">
                    <label for="reqExperience" class="form-label">Experience Required (years)</label>
                    <input type="number" class="form-control" id="reqExperience" name="reqExperience" required>
                </div>
                <div class="mb-3">
                    <label for="postTechStack" class="form-label">Tech Stack</label>
                    <select multiple class="form-select" id="postTechStack" name="postTechStack" required>
                        <option value="Java">Java</option>
                        <option value="Spring">Spring</option>
                        <option value="JavaScript">JavaScript</option>
                        <option value="Python">Python</option>
                        <option value="Ruby">Ruby</option>
                        <option value="C#">C#</option>
                        <!-- Add more options as needed -->
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

      THIS IS FOR JUST VIEWING THE FORM.....
 */
