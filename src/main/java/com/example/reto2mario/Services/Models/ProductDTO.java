package com.example.reto2mario.Services.Models;


public class ProductDTO{
    
    private Long id;
     private String nombre;
     private String precio;
   private  String urlimagen;

 
  
   
   
    public ProductDTO() {
    }

    public ProductDTO(Long id, String nombre, String precio, String urlimagen) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.urlimagen = urlimagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }
}