package com.example.reto2mario.Web.View;

import com.example.reto2mario.Services.Models.PedidoDTO;
import com.example.reto2mario.Services.Models.PedidoService;
import com.example.reto2mario.Services.Models.ProductDTO;
import com.example.reto2mario.Services.Models.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("tienda/pedidos")
public class PedidoViewController {
    
 /*     private final PedidoService pedidoService;
    
    PedidoViewController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public ModelAndView PedidosV2(){
        ModelAndView mv = new ModelAndView("listPedidos");
       mv.addObject("products", pedidoService.getAll());
        return mv;
    }

    @GetMapping("/new")
    public ModelAndView CreatePedido(){
        ModelAndView mv = new ModelAndView("detailPedidos");
        mv.addObject("pedido", new PedidoDTO());
        return mv;
    }
    
    @GetMapping("/edit/{id}")
    public ModelAndView EditPedido(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("detailPedidos");
    var pedidoOrEmpty = pedidoService.findById(id);

    PedidoDTO pedido = new PedidoDTO();
    if(pedidoOrEmpty.isPresent())
    pedido = pedidoOrEmpty.get();
    mv.addObject("pedido", pedido);
        return mv;
    }   */
}
