package com.centdom.crm.crm;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class EntryController {

    @GetMapping
    public String home() {
        return "home";
    }


}
