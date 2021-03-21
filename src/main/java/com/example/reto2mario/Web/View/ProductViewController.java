package com.example.reto2mario.Web.View;

import com.example.reto2mario.Services.Models.ProductDTO;
import com.example.reto2mario.Services.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("tienda/productos")
public class ProductViewController {
    
       private final ProductService productService;
    
    ProductViewController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ModelAndView ProductsV2(){
        ModelAndView mv = new ModelAndView("listProducts");
       mv.addObject("products", productService.getAll());
        return mv;
    }

    @GetMapping("/new")
    public ModelAndView CreateProduct(){
        ModelAndView mv = new ModelAndView("detailProducts");
        mv.addObject("product", new ProductDTO());
        return mv;
    }
    
    @GetMapping("/edit/{id}")
    public ModelAndView EditMovie(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("detailProducts");
    var productOrEmpty = productService.findById(id);

    ProductDTO product = new ProductDTO();
    if(productOrEmpty.isPresent())
    product = productOrEmpty.get();
    mv.addObject("product", product);
        return mv;
    }    

}