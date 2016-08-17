package com.example.sngular.formacion.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sngular.formacion.product.dto.Product;

@RestController
@RequestMapping("v1/products")
public class ProductsRESTController {

	//@Autowired
	//private ProductsRepository repository;
	
	@MockBean
	private ProductsRepository repository;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Product> create(@RequestBody Product product) {
		product.setId("1234");
		repository.save(product);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Product get(@PathVariable String id) {
		Product product = new Product();
		product.setId(id);
		return product;
	}	
	
}