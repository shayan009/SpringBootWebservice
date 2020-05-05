package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import com.sample.demo.entity.ProductEntity;

public interface ProductService {

	ProductEntity insertProduct(ProductEntity productEntity);

	List<ProductEntity> listAll();

	Optional<ProductEntity> findUserById(int userId);

}
