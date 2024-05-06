package com.example.apppaas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApppaasController {

    @GetMapping("/")
    public String apppaas(){
        return "apppaas";
    }
}
