package com.example.reto2mario.Services.Models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;

import com.example.reto2mario.Repositories.Entities.PedidoEntity;
import com.example.reto2mario.Repositories.Interfaces.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ModelMapper modelMapper;

      public List<PedidoDTO> getAll() {
        return pedidoRepository.findAll().stream()
        .map(x -> modelMapper.map(x, PedidoDTO.class))
              .collect(Collectors.toList());
    }  

    public PedidoDTO add(PedidoDTO pedido) {
        PedidoEntity entityToInsert = modelMapper.map(pedido, PedidoEntity.class);
        PedidoEntity result = pedidoRepository.save(entityToInsert);
        return modelMapper.map(result, PedidoDTO.class);
    }

    public PedidoDTO update(Long id, PedidoDTO order) {
        PedidoEntity entityToUpdate = modelMapper.map(order, PedidoEntity.class);
        PedidoEntity result = pedidoRepository.save(entityToUpdate);
        return modelMapper.map(result, PedidoDTO.class);

    }

    public void delete(Long id) {
        Optional<PedidoEntity> entityToDelete = pedidoRepository.findById(id);
        if (entityToDelete.isPresent())
            pedidoRepository.delete(entityToDelete.get());
    }

    public Optional<PedidoDTO> findById(Long id){
        Optional<PedidoEntity> entity = pedidoRepository.findById(id);
        if(entity.isPresent())
        return Optional.of(modelMapper.map(entity.get(), PedidoDTO.class));
        else
        return Optional.empty();
    }

    public List<PedidoDTO> getByDate(String date) {
        return pedidoRepository.findByDate(date).stream()
        .map(x -> modelMapper.map(x, PedidoDTO.class))
              .collect(Collectors.toList());
    }

    public List<PedidoDTO> getByName(String nombre_usuario) {
        return pedidoRepository.findByName(nombre_usuario).stream()
        .map(x -> modelMapper.map(x, PedidoDTO.class))
              .collect(Collectors.toList());
    }


    public List<PedidoDTO> getById(Long id) {
        return pedidoRepository.findById(id).stream()
        .map(x -> modelMapper.map(x, PedidoDTO.class))
              .collect(Collectors.toList());
    }

   /*  public List<PedidoDTO> findByUserIdWMethod(Long id) {
        return EntitiesToDTO(pedidoRepository.findById(id));
      
    }

    public List<PedidoDTO> EntitiesToDTO(Collection<PedidoEntity>pedido){
        return pedido.stream().map(x -> modelMapper.map(x, PedidoDTO.class))
        .collect(Collectors.toList());
    } */

}
