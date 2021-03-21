
package com.example.reto2mario.Web.API;

import java.util.List;
import java.util.Optional;

import com.example.reto2mario.Services.Models.ProductDTO;
import com.example.reto2mario.Services.ProductService;

import java.util.List;
import java.util.Optional;

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
@RequestMapping("/v2/products")

public class ProductController {

    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;

    }

     @GetMapping()
    public List<ProductDTO> GetMovies(@RequestParam(name = "nombre",
     required = false, defaultValue = "")String nombre, 
     @RequestParam(name = "precio", required = false,defaultValue = "")String precio) {
       if(!nombre.equals("") && precio.equals("") ){
           return productService.getByTitle(nombre);
           
       }
        
       if(!precio.equals("") && nombre.equals("")){
           return productService.getByPrice(precio);
       }
        if(precio.equals("") && nombre.equals("")){
            return productService.getAll();
        }
        return null;

    } 

    @PostMapping
    public ProductDTO AddProduct(@RequestBody ProductDTO product) {
        return productService.add(product);
    }

    @PutMapping("/{id}")
    public ProductDTO UpdateMovie(@RequestBody ProductDTO product, @PathVariable("id") Long id) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public  void  DeleteMovie(@PathVariable("id") Long id) {
        productService.delete(id);
    }

    @GetMapping("/{id}")
    public List <ProductDTO> GetById(@PathVariable("id") Long id){
       return  productService.getById(id);

    }

  
        }
     


  
        
     