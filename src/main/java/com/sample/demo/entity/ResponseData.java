package com.sample.demo.entity;

import java.util.List;

public class ResponseData {

	boolean status;
	String message;
	ProductEntity entity;
	List<ProductEntity> listEnity;
	ProductImagesEntity productImagesEntity;
	
	public ProductImagesEntity getProductImagesEntity() {
		return productImagesEntity;
	}
	public void setProductImagesEntity(ProductImagesEntity productImagesEntity) {
		this.productImagesEntity = productImagesEntity;
	}
	public List<ProductEntity> getListEnity() {
		return listEnity;
	}
	public void setListEnity(List<ProductEntity> listEnity) {
		this.listEnity = listEnity;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ProductEntity getEntity() {
		return entity;
	}
	public void setEntity(ProductEntity entity) {
		this.entity = entity;
	}

	
	
}
