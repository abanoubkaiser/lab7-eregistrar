package edu.cs.registraraapp.eregistrar.controllers;

import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value ={"/ " } )
    public  String Index()
    {
        return "Index";
    }
}
