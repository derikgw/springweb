package com.derikwilson.web.springwebtemplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "hello"; // This should match the name of your JSP file (hello.jsp) without the path or extension
    }

}
