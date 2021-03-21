package com.example.reto2mario.Web.API;

import java.util.List;
import java.util.Optional;

import com.example.reto2mario.Services.Models.AllPedidoDTO;
import com.example.reto2mario.Services.Models.PedidoDTO;
import com.example.reto2mario.Services.PedidoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/orders")
public class PedidoController {

    private final PedidoService pedidoService;

    PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;

    }

     @GetMapping()
    public List<PedidoDTO> GetPedidos(@RequestParam(name = "nombre_usuario",
     required = false, defaultValue = "")String nombre_usuario, 
     @RequestParam(name = "date", required = false,defaultValue = "")String date) {
       if(!nombre_usuario.equals("") && date.equals("") ){
           return pedidoService.getByName(nombre_usuario);
           
       }
        
       if(!date.equals("") && nombre_usuario.equals("")){
           return pedidoService.getByDate(date);
       }
        if(date.equals("") && nombre_usuario.equals("")){
            return pedidoService.getAll();
        }
        return null;

    } 

    @PostMapping
    public PedidoDTO AddPedido(@RequestBody PedidoDTO pedido) {
        return pedidoService.add(pedido);
    }

    @PutMapping("/{id}")
    public PedidoDTO UpdatePedido(@RequestBody PedidoDTO pedido, @PathVariable("id") Long id) {
        return pedidoService.update(id, pedido);
    }

    @DeleteMapping("/{id}")
    public  void  DeletePedido(@PathVariable("id") Long id) {
        pedidoService.delete(id);
    }

    @GetMapping("/{id}")
    public List <PedidoDTO> GetById(@PathVariable("id") Long id){
       return  pedidoService.getById(id);

    }
    @GetMapping("/pedidosAll/{id}") // http://localhost:2222/v2/orders/pedidosAll/4
    public AllPedidoDTO GetAllOrders(@PathVariable("id")Long id){
        return pedidoService.createFull(id);
    }
  
        }
     
