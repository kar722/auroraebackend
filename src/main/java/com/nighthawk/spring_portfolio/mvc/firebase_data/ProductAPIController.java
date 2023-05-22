package com.nighthawk.spring_portfolio.mvc.firebase_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class ProductAPIController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProductDetails")
    public Product getProduct(@RequestParam String name ) throws InterruptedException, ExecutionException{
        return productService.getProductDetails(name);
    }

    @PostMapping("/createProduct")
    public String createProduct(@RequestBody Product product ) throws InterruptedException, ExecutionException {
        
        return productService.saveProductDetails(product);
    }

    @PutMapping("/updateProduct")
    public String updateProduct(@RequestBody Product product  ) throws InterruptedException, ExecutionException {
        return productService.updateProductDetails(product);
    }

    @DeleteMapping("/deleteProduct")
    public String deletePatient(@RequestParam String name){
        return productService.deleteProduct(name);
    }
}
