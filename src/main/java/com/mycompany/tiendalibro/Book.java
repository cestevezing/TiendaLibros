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
public class Book {
    
    private int reference;
    private String name;
    private String author;
    private String editorial;
    private int quantity;
    private double price;

    /**
     * Constructor para crear un nuevo libro
     * @param reference
     * @param name
     * @param author
     * @param editorial
     * @param quantity
     * @param price 
     */
    public Book(int reference, String name, String author, String editorial, int quantity, double price) {
        this.reference = reference;
        this.name = name;
        this.author = author;
        this.editorial = editorial;
        this.quantity = quantity;
        this.price = price;
    }

    
    public int getReference() {
        return reference;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    
    
}
