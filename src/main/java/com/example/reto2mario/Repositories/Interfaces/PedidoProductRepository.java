package com.example.reto2mario.Repositories.Interfaces;

import java.util.List;

import com.example.reto2mario.Repositories.Entities.PedidoProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PedidoProductRepository extends JpaRepository<PedidoProductEntity, Long> {
    
    @Query(value = "SELECT p FROM PedidoProduct p WHERE idPedido = :id")
    List<PedidoProductEntity> findOrderById(@Param("id") Long id);
}
