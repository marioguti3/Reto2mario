package com.example.reto2mario.Web.API;

import java.util.List;

import com.example.reto2mario.Services.PedidoProductService;
import com.example.reto2mario.Services.Models.PedidoProductDTO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pedidoproduct")
public class PedidoProductController {
    
    
    private final PedidoProductService pedidoproductService;

    PedidoProductController(PedidoProductService pedidoproductService) {
        this.pedidoproductService = pedidoproductService;

    }

     @GetMapping()
    public List<PedidoProductDTO>GetAll(){
        return pedidoproductService.getAll();
    }

    
    @PostMapping
    public PedidoProductDTO AddPedidoProduct(@RequestBody PedidoProductDTO pedidoproduct) {
        return pedidoproductService.add(pedidoproduct);
    }

    @PutMapping("/{id}")
    public PedidoProductDTO UpdatePedidoProduct(@RequestBody PedidoProductDTO pedidoproduct, 
    @PathVariable("id") Long id) {
        return pedidoproductService.update(id, pedidoproduct);
    }

    @DeleteMapping("/{id}")
    public  void  DeletePedidoProduct(@PathVariable("id") Long id) {
        pedidoproductService.delete(id);
    }

    @GetMapping("/{id}")
    public List<PedidoProductDTO> GetById(@PathVariable("id") Long id){
       return  pedidoproductService.getById(id);

    }

}
