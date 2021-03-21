package com.example.reto2mario.Repositories.Interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.reto2mario.Repositories.Entities.PedidoEntity;
import com.example.reto2mario.Repositories.Entities.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

    @Query(value = "SELECT p " + " FROM Pedidos p " + "WHERE id = :id")
    Optional<PedidoEntity> findById(
        @Param("id") Long id);

  
    @Query(value = "SELECT p " + " FROM Pedidos p " + "WHERE date = :date")
    Collection<PedidoEntity> findByDate( @Param("date") String date);

    @Query(value = "SELECT p " + " FROM Pedidos p " + "WHERE nombre_usuario = :nombre_usuario")
        Collection<PedidoEntity> findByName( @Param("nombre_usuario") String nombre_usuario);


     @Query(value = "SELECT O FROM Pedidos O "+
    "WHERE O.id = :id")
    PedidoEntity findByPedido(@Param("id") Long id);
}