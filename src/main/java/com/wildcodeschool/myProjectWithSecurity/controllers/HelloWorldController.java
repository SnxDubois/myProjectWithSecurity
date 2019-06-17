package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers Assemble";
    }

    @GetMapping("/secret-bases")
    public String schools() {
        return "Berlin, Biarritz, Bordeaux, Bruxelles, Bucarest, La Loupe (au vert!), Lille; Lisbonne, Londres, Lyon, Madrid, Marseille, " +
                "Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours";
    }
}
