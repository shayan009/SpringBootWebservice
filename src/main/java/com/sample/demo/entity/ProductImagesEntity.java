package com.sample.demo.entity;




public class ProductImagesEntity {

	

    Integer productId;

    private String path;
  


    
    
    
	public ProductImagesEntity(Integer productId, String path) {
		super();
		this.productId = productId;
		this.path = path;
	}

	public Integer getProduct_id() {
		return productId;
	}

	public void setProduct_id(Integer productId) {
		this.productId = productId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

    

}
