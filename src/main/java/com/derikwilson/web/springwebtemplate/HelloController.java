package com.derikwilson.web.springwebtemplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name, Model model) {

        if (name != null && !name.isEmpty()) {
            model.addAttribute("message", "Welcome to Spring MVC, " + name + "!");
        } else {
            model.addAttribute("message", "Welcome to Spring MVC!");
        }
        return "hello"; // This should match the name of your JSP file (hello.jsp) without the path or extension
    }

}
