/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.desarrollador.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jorge.desarrollador.dao.UsuarioMapper;
import com.jorge.desarrollador.domain.Users;
import com.jorge.desarrollador.service.UsuarioService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sistema
 */
@Service("UsuarioService")
public class UsuarioImpl implements UsuarioService{
    
    @Autowired
    UsuarioMapper daoUsuario;
    
    @Override
    public List<Users> findAll() throws Exception {
        
        List<Users> listaUsuario = daoUsuario.findAll();

        return listaUsuario;
    }
        
    @Override
    public void insertUsuario(Users usuario) throws JsonParseException, JsonMappingException, IOException{

        daoUsuario.insertUsuario(usuario);

    }
    
    @Override
    public void updateUsuario(Users usuario) throws JsonParseException, JsonMappingException, IOException{

        daoUsuario.updateUsuario(usuario);

    }
    
    @Override
    public void deleteUsuario(Integer id) throws JsonParseException, JsonMappingException, IOException{

        daoUsuario.deleteUsuario(id);

    }

}
