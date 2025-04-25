package com.example.MiPrimeraPaginaWeb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class HomeController {

    @GetMapping("/")    
    public String index(){
        return "Hola a todos";
    }

    @GetMapping("/adios")    
    public String adioss(){
        return "Adios a todos";
    }

    @GetMapping("/valor")
    public String getMethodName(@RequestParam int num1) {
        return "Hola, el valor de el numero era: "+num1;
    }
}
