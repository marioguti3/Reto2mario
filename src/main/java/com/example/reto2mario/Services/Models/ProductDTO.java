package com.example.reto2mario.Services.Models;


public class ProductDTO{
    
    Long id;
    String nombre;
    String precio;
    String urlimagen;


  
   
    public Long getById(){
        return id;
    }
    
    public void setId(Long id){
    this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public String getPrecio(){
        return precio;
    }
    
    public void setPrecio(String  precio){
    this.precio = precio;
    }
    
    public String getUrlimagen(){
        return urlimagen;
    }
    
    public void setUrlimagen(String urlimagen){
    this.urlimagen = urlimagen;
    }
}