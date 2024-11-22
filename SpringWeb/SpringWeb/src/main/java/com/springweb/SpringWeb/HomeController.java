package com.springweb.SpringWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String course()
    { 
//        model.addAttribute("course","java");
        return "Java";
    }

    @GetMapping("/")
    public String home()
    {
        System.out.println("Method call...");
        return "home";
    }

//    @GetMapping("Add")
//    public String add(HttpServletRequest req, HttpSession session)
//    {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int value = num1 + num2;
//
//        session.setAttribute("finalValue" , value);
//        return "result";
//    }


//    @GetMapping("Add")
//    public String addTwoNumber(@RequestParam("num1") int x , @RequestParam("num2") int y, Model model)
//    {
//        int value = x + y;
////        session.setAttribute("finalValue", value);
//        model.addAttribute("finalValue",value);
//        return "result";
//    }


//@GetMapping("Add")
//public ModelAndView addTwoNumber(@RequestParam("num1") int x , @RequestParam("num2") int y, ModelAndView mv)
//{
//    int value = x + y;
//    mv.addObject("finalValue",value);
//    mv.setViewName("result");
//    return mv;
//}

//    @GetMapping("addObject")
//    public ModelAndView addObject(@RequestParam("aid") int id , @RequestParam("aname") String name, ModelAndView mv)
//    {
//        Alien alien = new Alien();
//        alien.setId(id);
//        alien.setName(name);
//        mv.addObject("finalValue",alien);
//        mv.setViewName("result");
//        return mv;
//    }

//    @GetMapping("addObject")
//    public String addObject(@ModelAttribute("alien1") Alien alien, Model model)
//    {
////        mv.addObject("finalValue",alien);
////        mv.setViewName("result");
////        return mv;
//        model.addAttribute("alien1",alien);
//        return "result";
//    }


//@GetMapping("addObject")
//public String addObject(@ModelAttribute("alien1") Alien alien, Model model) {
//    System.out.println("ID: " + alien.getId()); // Debugging line
//    System.out.println("Name: " + alien.getName()); // Debugging line
//    model.addAttribute("alien1", alien);
//    return "result"; // Ensure this view exists
//}

    @GetMapping("addObject")
    public String addObject(@ModelAttribute("alien1") Alien alien) {
        return "result";
    }
}
