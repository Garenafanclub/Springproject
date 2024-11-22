package com.SpringWebPrac.WebApp.Controller;

import com.SpringWebPrac.WebApp.Model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @ModelAttribute("course")
    public String dynamicInsertion()
    {
        return "java";
    }

    @GetMapping({"/","home"})
    public String home()
    {
        return "home";
    }

    @GetMapping("/addNumber")
    public String add(@RequestParam("num1") int num1 , @RequestParam("num2") int num2, Model model)
    {
        int result = num1 + num2;
        System.out.println(result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("Add",result);
        return "result";
    }
    // INSTEAD OF USING REQUEST PARAM YOU CAN USE MODEL ATTRIBUTE TO MORE ENCAPSULATE THE CODE BY MAKING A CLASS
    // CALLED CALCULATOR WHICH BASICALLY HAVE TWO DATA MEMBERS NUM1 NUM2 AND GETTER SETTER TO ASSIGN THEM.
    // NOW USE THIS CLASS HERE...

    @GetMapping("/addObject")
    public ModelAndView addObject(@ModelAttribute("Alien") Alien alien, ModelAndView mv)
    {
      mv.addObject("studentInfo",alien);
      mv.setViewName("result");
      return mv;
    }
}
