
package com.example.reto2mario.Services.Models;

public class PedidoDTO{
    

     private Long id;
     private  String date;
     private  String nombre_usuario;
     private  String estado;
	
     public PedidoDTO(){} 
     
     public PedidoDTO(Long id, String date, String nombre_usuario, String estado) {
		this.id = id;
		this.date = date;
		this.nombre_usuario = nombre_usuario;
		this.estado = estado;
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