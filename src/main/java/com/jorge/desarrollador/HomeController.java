/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.desarrollador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sistema
 */
@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String home(){
        return "Bienvenido a Spring Boot";
    }
}
