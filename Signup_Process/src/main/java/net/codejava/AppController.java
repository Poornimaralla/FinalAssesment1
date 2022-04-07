package net.codejava;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
@Controller
public class AppController {
    @Autowired
    public LoginService service;

    @RequestMapping("/")
    public String viewHomepage(){
        List<Login> loginList=service.listAll();

        return "Login";
    }



    @RequestMapping
    public String savePage(){
        Login login=new Login();
        Login login=service.save("Login",long);
        return "LoginPage";
    }}








