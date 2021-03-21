package com.example.reto2mario.Services.Models;


public class PedidoProductDTO {
    
    private  Long id;
    private Long idProducto;
    private Long idPedido;
    private int cantidad;
  
    public PedidoProductDTO() {}

    public PedidoProductDTO(Long idProducto, Long idPedido, int cantidad) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
