/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.desarrollador.controller;

import com.jorge.desarrollador.domain.Users;
import com.jorge.desarrollador.service.UsuarioService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sistema
 */

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @RequestMapping(value = "/rest/users/readAll", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Object findAll(HttpServletRequest request) throws Exception {

        return usuarioService.findAll();
        
    }
    
    @RequestMapping(value = "/rest/users/insert", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Object insertUsuario(HttpServletRequest request, @RequestBody Users usuario) throws Exception {
        //Registro sin parámetros
//        Users users = new Users();
//        users.setName("Miguel");
//        users.setSalary(2444L);
//
//        usuarioService.insertUsuario(users);
//        
//        return "Registro exitoso";
        
//Registro con parámetros
//        String nombre = String.valueOf(request.getParameter("name"));
//        //Long salario = Long.valueOf(request.getParameter("salary"));
//        Users users = new Users();
//        users.setName(nombre);
//        users.setSalary(2600L);
//
//        try{
//           usuarioService.insertUsuario(users); 
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        return "Registro exitoso";
//        
        //Registro con objeto JSON
        //usuario.setSalary(2200L);
        
        try{
           usuarioService.insertUsuario(usuario); 
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return "Registro exitoso";
        
    }
    
}
