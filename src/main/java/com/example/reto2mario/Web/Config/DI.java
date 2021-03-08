package com.example.reto2mario.Web.Config;

import com.example.reto2mario.Services.Models.PedidoService;
import com.example.reto2mario.Services.Models.ProductService;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    @Bean
    ProductService createProductService() {
        return new ProductService();
    }

    @Bean
    PedidoService createPedidoService() {
        return new PedidoService();
    }
    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }
}