/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.desarrollador.dao;

/**
 *
 * @author Sistema
 */

import com.jorge.desarrollador.domain.*;
import java.util.List;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UsuarioMapper {
    
    @Select("select * from users ")
    public List<Users> findAll();
    
    @Insert("insert into users(name,salary) values(#{usuario.name},#{usuario.salary})")
    public void insertUsuario(@Param("usuario") Users usuario);
}
