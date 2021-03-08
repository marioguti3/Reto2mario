
package com.example.reto2mario.Web.Config;

import com.example.reto2mario.Repositories.Entities.PedidoEntity;
import com.example.reto2mario.Repositories.Entities.ProductEntity;
import com.example.reto2mario.Repositories.Interfaces.PedidoRepository;
import com.example.reto2mario.Repositories.Interfaces.ProductRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductRepository repository ,  PedidoRepository repository2 ){
        return args ->{

            repository.save(new ProductEntity("Webcam 1080P Full HD ANVASK","30","https://images-na.ssl-images-amazon.com/images/I/71vPDq1rWDL._AC_SL1500_.jpg"));
            repository.save(new ProductEntity("Monitor Lenovo D24-20 Full HD","120","https://images-na.ssl-images-amazon.com/images/I/51UdgnY2X9L._AC_SL1200_.jpg"));
            repository.save(new ProductEntity("Teclado inalambrico Logitech K380","40","https://images-na.ssl-images-amazon.com/images/I/61%2BWA7Sqj0L._AC_SL1500_.jpg"));
            repository.save(new ProductEntity("Cecotec Robot Aspirador Conga","130","https://images-na.ssl-images-amazon.com/images/I/51PxD5SQDjL._AC_SL1000_.jpg"));
            repository.save(new ProductEntity("Portatil Lenovo IdeaPad 3","879","https://images-na.ssl-images-amazon.com/images/I/71WLgyFRGqL._AC_SL1500_.jpg"));
            repository.save(new ProductEntity("Impresora HP Envy 6020","72","https://images-na.ssl-images-amazon.com/images/I/61UfjvIqXOL._AC_SL1500_.jpg"));
            repository.save(new ProductEntity("SmartWatch SoundPets IP68","25","https://images-na.ssl-images-amazon.com/images/I/514Y7g-JQDL._AC_SL1000_.jpg"));

        
           repository2.save(new PedidoEntity(1L,"20/03/2019","PEPE","EN CURSO"));
           repository2.save(new PedidoEntity(2L,"12/02/2019","MEL","ACEPTADO"));
           repository2.save(new PedidoEntity(3L,"1/06/2019","BENITO","ENVIADO"));
           repository2.save(new PedidoEntity(4L,"24/02/2019","CAMELA","CANCELADO"));  
            
        };
        };
    }
