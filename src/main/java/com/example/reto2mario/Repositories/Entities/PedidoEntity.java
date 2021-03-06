package com.example.reto2mario.Repositories.Entities;

import java.time.DateTimeException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Pedidos")
@Entity(name="Pedidos")
public class PedidoEntity{
    
   

    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
   private  String date;
   private  String nombre_usuario;
  private   String estado;

    public PedidoEntity(Long id, String date, String nombre_usuario, String estado) {
        this.id = id;
        this.date = date;
        this.nombre_usuario = nombre_usuario;
        this.estado = estado;
    }

    public PedidoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

   
   
}
