package com.example.reto2mario.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.reto2mario.Repositories.Entities.PedidoProductEntity;
import com.example.reto2mario.Repositories.Interfaces.PedidoProductRepository;
import com.example.reto2mario.Services.Models.PedidoProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class PedidoProductService {
    
    @Autowired
    private PedidoProductRepository pedidoproductRepository;
    @Autowired
    private ModelMapper modelMapper;

      public List<PedidoProductDTO> getAll() {
        return pedidoproductRepository.findAll().stream()
        .map(x -> modelMapper.map(x, PedidoProductDTO.class))
              .collect(Collectors.toList());
    }  

    public PedidoProductDTO add(PedidoProductDTO pedidoproduct) {
        PedidoProductEntity entityToInsert = modelMapper.map(pedidoproduct, PedidoProductEntity.class);
        PedidoProductEntity result = pedidoproductRepository.save(entityToInsert);
        return modelMapper.map(result, PedidoProductDTO.class);
    }

    public PedidoProductDTO update(Long id, PedidoProductDTO orderproduct) {
        PedidoProductEntity entityToUpdate = modelMapper.map(orderproduct, PedidoProductEntity.class);
        PedidoProductEntity result = pedidoproductRepository.save(entityToUpdate);
        return modelMapper.map(result, PedidoProductDTO.class);

    }

    public void delete(Long id) {
        Optional<PedidoProductEntity> entityToDelete = pedidoproductRepository.findById(id);
        if (entityToDelete.isPresent())
            pedidoproductRepository.delete(entityToDelete.get());
    }

    public Optional<PedidoProductDTO> findById(Long id){
        Optional<PedidoProductEntity> entity = pedidoproductRepository.findById(id);
        if(entity.isPresent())
        return Optional.of(modelMapper.map(entity.get(), PedidoProductDTO.class));
        else
        return Optional.empty();
    }

 
    public List<PedidoProductDTO> getById(Long id) {
        return pedidoproductRepository.findById(id).stream()
        .map(x -> modelMapper.map(x, PedidoProductDTO.class))
              .collect(Collectors.toList());
    }

   
}
