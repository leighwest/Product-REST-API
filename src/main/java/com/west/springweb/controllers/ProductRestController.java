package com.west.springweb.controllers;

import com.west.springweb.entities.Product;
import com.west.springweb.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") Long id) {
        return repository.findById(id).isPresent() ? repository.findById(id).get() : null;
    }

    @RequestMapping(value = "/products/", method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/products/", method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}
