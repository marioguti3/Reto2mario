
package com.example.reto2mario.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.reto2mario.Repositories.Entities.ProductEntity;
import com.example.reto2mario.Repositories.Interfaces.ProductRepository;
import com.example.reto2mario.Services.Models.ProductCantidadDTO;
import com.example.reto2mario.Services.Models.ProductDTO;

import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

      public List<ProductDTO> getAll() {
        return productRepository.findAll().stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
              .collect(Collectors.toList());
    }  

    public ProductDTO add(ProductDTO product) {
        ProductEntity entityToInsert = modelMapper.map(product, ProductEntity.class);
        ProductEntity result = productRepository.save(entityToInsert);
        return modelMapper.map(result, ProductDTO.class);
    }

    public ProductDTO update(Long id, ProductDTO product) {
        ProductEntity entityToUpdate = modelMapper.map(product, ProductEntity.class);
        ProductEntity result = productRepository.save(entityToUpdate);
        return modelMapper.map(result, ProductDTO.class);

    }

    public void delete(Long id) {
        Optional<ProductEntity> entityToDelete = productRepository.findById(id);
        if (entityToDelete.isPresent())
            productRepository.delete(entityToDelete.get());
    }

    public Optional<ProductDTO> findById(Long id){
        Optional<ProductEntity> entity = productRepository.findById(id);
        if(entity.isPresent())
        return Optional.of(modelMapper.map(entity.get(), ProductDTO.class));
        else
        return Optional.empty();
    }

    public List<ProductDTO> getByPrice(String precio) {
        return productRepository.findByPrice(precio).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
              .collect(Collectors.toList());
    }

    public List<ProductDTO> getByTitle(String nombre) {
        return productRepository.findByTitle(nombre).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
              .collect(Collectors.toList());
    }

    public List<ProductDTO> getById(Long id) {
        return productRepository.findById(id).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
              .collect(Collectors.toList());
    }


    public List<ProductCantidadDTO> GetByProductCantidad(List<Object[]> input){
        List<ProductCantidadDTO> result = new ArrayList<ProductCantidadDTO>();
        for(Object[] object : input){
            result.add(new ProductCantidadDTO((ProductEntity)object[0],(int)object[1]));
        }

        return result;

    }

    public List<ProductCantidadDTO> findByOrderProduct(Long id){
        return GetByProductCantidad(productRepository.findByOrderId(id));
    }


}
