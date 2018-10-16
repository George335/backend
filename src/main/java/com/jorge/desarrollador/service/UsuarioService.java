/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.desarrollador.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jorge.desarrollador.domain.Users;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Sistema
 */
public interface UsuarioService {
    
    public List<Users> findAll() throws Exception;
    
    public void insertUsuario(Users usuario) throws JsonParseException, JsonMappingException, IOException;
    
}
