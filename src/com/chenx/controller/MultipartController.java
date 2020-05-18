package com.chenx.controller;

import com.chenx.entity.Person;
import com.chenx.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MultipartController {

//
//    @ExceptionHandler(value = {MyException.class})
//    public void handlerMyException() {
//        System.out.println("Myerror");
//    }
//

    @RequestMapping(value = "/mul", method = POST)
    public String test(@RequestPart("pic") Part file, @RequestParam("name") String name, HttpServletRequest request) throws Exception {
        if (name.equals("123")) {
            throw new MyException();
        }
       // file.write("classpath:/resource/" + file.getSubmittedFileName());
        return "success";
    }


    @ModelAttribute
    public void populateModel(Model model, HttpServletRequest request, Person person1) {
        Person person = new Person();
        person.setName("fdfdfd");
        model.addAttribute("person12", person);
    }

    @RequestMapping(value = "helloWorld")
    public String helloWorld(Model model, Person person, HttpServletRequest request, HttpServletResponse response) {

        return "home";
    }

}
