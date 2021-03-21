package com.example.reto2mario.Repositories.Interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.reto2mario.Repositories.Entities.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query(value = "SELECT p " + " FROM Productos p " + "WHERE id = :id")
    Optional<ProductEntity> findById(
        @Param("id") Long id);

  
    @Query(value = "SELECT p " + " FROM Productos p " + "WHERE precio = :precio")
    Collection<ProductEntity> findByPrice(
        @Param("precio") String precio);

    @Query(value = "SELECT p " + " FROM Productos p " + "WHERE nombre = :nombre")
        Collection<ProductEntity> findByTitle(
            @Param("nombre") String nombre);


     @Query(value = "SELECT p, pp.cantidad FROM PedidoProduct pp "+
            " INNER JOIN Productos p ON pp.idProducto = p.id "+
            " WHERE pp.idPedido= :id ")
            List<Object[]> findByOrderId(@Param("id") Long id); 
    

        }

