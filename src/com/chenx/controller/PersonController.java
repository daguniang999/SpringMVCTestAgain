package com.chenx.controller;

import com.chenx.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequestMapping("test")
public class PersonController {

    @ModelAttribute
    public Person initPage(Model model) {
        Person person = new Person();
        person.setName("111111");
        return person;
    }

    @RequestMapping("testred")
    public String redirecttest(Model model, HttpServletRequest request) {
        System.out.println(request.getAttribute("name1"));
        System.out.println(request.getAttribute("name"));
        return "helloWorld";
    }


    @RequestMapping(value = "home")
    public String home(RedirectAttributes model, HttpServletRequest request) {
        model.addFlashAttribute("name", "1111");
        request.setAttribute("name1", "12222");
        //model.addFlashAttribute("name", "1111");
        return "forward:testred";
    }

}
