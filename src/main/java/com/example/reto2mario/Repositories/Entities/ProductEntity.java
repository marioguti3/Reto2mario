package com.example.reto2mario.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Productos")
@Entity(name="Productos")
public class ProductEntity{
      
     
    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
   private  String nombre;
    private String precio;
   private  String urlimagen;


    public ProductEntity( String nombre, String precio, String urlimagen) {
      
        this.nombre = nombre;
        this.precio = precio;
        this.urlimagen = urlimagen;
    }

    
    public ProductEntity() {
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