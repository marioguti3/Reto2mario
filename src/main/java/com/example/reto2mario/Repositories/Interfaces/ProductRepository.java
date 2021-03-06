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


/*     @Query(value = "SELECT p" + "FROM Productos p" + "(WHERE : precio= 0 OR p.precio=:precio)" 
    "AND (:nombre=OR p.nombre LIKE %:nombre%")
    Collection <ProductEntity>  findByTitlePrice(
        @Param("precio","nombre")String precio, String nombre); */
    

        }

