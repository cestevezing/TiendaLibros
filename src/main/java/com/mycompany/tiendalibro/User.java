/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiendalibro;

/**
 *
 * @author Cristian
 */
public class User {

    private int id;
    private String name;
    private int phone;
    
    /**
     * Constructor para crear un nuevo User
     * @param id
     * @param name
     * @param phone 
     */
    public User(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }
    
    
}
