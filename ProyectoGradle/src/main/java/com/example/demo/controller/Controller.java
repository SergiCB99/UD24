package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
 
    @GetMapping
    public String saludos(@RequestParam(required = false, defaultValue = "") String nombre) {
        return "".equals(nombre) ? "Hola Gradle!" : "Gradle " + nombre;
    }
}
