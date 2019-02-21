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
public class Admin {

    /**
     * constructor
     */
    public Admin() {
    }
    
    /**
     * Crea un nuevo usuario o cliente 
     * @param id
     * @param name
     * @param phone 
     */
    public void craarUser(int id, String name, int phone){
        
    }
    
    /**
     * Registra un nuevo libro
     * @param reference
     * @param name
     * @param author
     * @param editorial
     * @param quantity
     * @param price 
     */    
    public void registrarLibro(int reference, String name, String author, String editorial, int quantity, double price){
        
    }
    /**
     * Metodo que registra la venta de un libro
     * @param reference
     * @param userId 
     */
    public void ventaLibro(int reference, int userId){
        
    }
    
    /**
     * Notifica que libros tienen la cantidad debajo de las 10 unidades
     */
    public void notificacion(){
        
    }
    
    /**
     * consulta cual es el libro mas vendido
     */
    public void masVendido(){
        
    }
    
    /**
     * consulta cual es el libro menos vendido
     */
    public void menosVendido(){
        
    }
    
    /**
     * consulta cual es el libro mas caro
     */
    public void masCaro(){
        
    }
    
    /**
     * consulta cual es el libro mas barato
     */
    public void masBarato(){
        
    }
    
    /**
     * Consulta cual es al cantidad total que hay de un libro
     * @param reference 
     */
    public void cantidadTotal(int reference){
        
    }
}
