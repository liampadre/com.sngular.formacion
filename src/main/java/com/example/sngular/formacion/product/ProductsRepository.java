package com.example.sngular.formacion.product;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sngular.formacion.product.dto.Product;

public interface ProductsRepository extends MongoRepository<Product, String>{

	List<Product> findAllByName(String name); //Intenta generar los queries por lo bajo y si no lo encuentra peta
	
	List<Product> findAllByPriceGreaterThan(Double price); //Lo mismo, eso es SpringData para MongoDB
	
}
