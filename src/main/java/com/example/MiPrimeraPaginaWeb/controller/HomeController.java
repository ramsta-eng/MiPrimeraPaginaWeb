package com.example.MiPrimeraPaginaWeb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v2")
public class HomeController {

    @GetMapping("/")    
    public String index(){
        return "Hola a todos";
    }

    @GetMapping("/adios")    
    public String adioss(){
        return "Adios a todos";
    }

    @GetMapping("/valores")
    public String getMethodName(@RequestParam int num1) {
        return "Hola, el valor de el numero ess: "+num1;
    }
}
