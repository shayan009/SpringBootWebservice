package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.sample.demo.entity.ProductEntity;
import com.sample.demo.entity.ProductImagesEntity;

public interface ProductService {

	ProductEntity insertProduct(ProductEntity productEntity);
	

	
	List<ProductEntity> listAll();

	Optional<ProductEntity> findUserById(int userId);

}
