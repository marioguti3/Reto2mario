package com.example.reto2mario.Services.Models;

import java.util.List;

import com.example.reto2mario.Repositories.Entities.PedidoEntity;

public class AllPedidoDTO{
    public List<ProductCantidadDTO> productList;
    public PedidoEntity pedido;

    public AllPedidoDTO() {
    }

    public AllPedidoDTO(List<ProductCantidadDTO>productList, PedidoEntity pedido) {
        this.productList = productList;
        this.pedido = pedido;
    }

    public List<ProductCantidadDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductCantidadDTO> productList) {
        this.productList = productList;
    }

    public PedidoEntity getPedido() {
        return pedido;
    }

    public void setPedido(PedidoEntity pedido) {
        this.pedido = pedido;
    }

   
}
