package com.sample.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.entity.ProductEntity;

public interface ApplicationDao extends JpaRepository<ProductEntity, Integer> {

}
