package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.dao.ProductEntityDao;
import com.sample.demo.entity.ProductEntity;
import com.sample.demo.entity.ProductImagesEntity;

@Service
public class ProductServiceImpl implements ProductService {

	

@Autowired
private ProductEntityDao applicationDao;
	




@Override
public ProductEntity insertProduct(ProductEntity productEntity ) {
	return applicationDao.save(productEntity);
}

@Override
public List<ProductEntity> listAll() {
	return applicationDao.findAll();
}

@Override
public Optional<ProductEntity> findUserById(int userId) {
	// TODO Auto-generated method stub
	return applicationDao.findById(userId);
}


}
