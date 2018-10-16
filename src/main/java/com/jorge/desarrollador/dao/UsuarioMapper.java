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
    
    @Update(" UPDATE users set name=#{usuario.name}, salary=#{usuario.salary} " +
            "  where id = #{usuario.id}")
    public boolean updateUsuario(@Param("usuario") Users usuario);
    
    @Delete(" delete from users where id=#{id}")
    public void deleteUsuario(@Param("id") int id);
}
