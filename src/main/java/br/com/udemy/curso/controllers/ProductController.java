package br.com.udemy.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.udemy.curso.entities.Product;
import br.com.udemy.curso.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productService.findAll();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product category = productService.findById(id);
		return ResponseEntity.ok(category);
	}

}
