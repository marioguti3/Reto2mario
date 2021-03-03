
package com.example.reto2mario.Services.Models;

public class PedidoDTO{
    

    Long id;
    String date;
    String nombre_usuario;
    String estado;


    
    
    public Long getById(){
        return id;
    }
    
    public void setId(Long id){
    this.id = id;
    }
 
   
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
    this.date = date;
    }
    
    public String getUser_name(){
        return nombre_usuario;
    }
    
    public void setUser_name(String nombre_usuario){
    this.nombre_usuario = nombre_usuario;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
    this.estado = estado;
    }




}