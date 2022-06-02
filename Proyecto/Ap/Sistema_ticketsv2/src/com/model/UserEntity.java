/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author pc
 */
public class UserEntity {
    
    private final String user;
    private final String contraseña;
    
    private static UserEntity userEntity;
    
    private UserEntity(String user, String contraseña){
        this.user = user;
        this.contraseña = contraseña;
    }
    
    public static UserEntity getInstance(String user, String contraseña){
        if (userEntity == null){
            userEntity = new UserEntity(user, contraseña);
        }
        return userEntity;
    }

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
    
}
