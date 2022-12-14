package com.develhope.DeployEnvironmentsVariables.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Environment environment;


    @GetMapping("/test")
    public String test(){
        String messaggio_1 = environment.getProperty("MESSAGGIO_1");
        return messaggio_1;
    }

    @GetMapping("/prod")
    public String prod(){
        String messaggio_2 = environment.getProperty("MESSAGGIO_2");
        return messaggio_2;
    }
}
