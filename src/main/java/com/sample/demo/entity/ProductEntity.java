package com.sample.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
@SecondaryTable(name = "product_images")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(/* name="path", */table = "product_images")
    private String path;
	
    private String name;
    private float price;
 
   
    
    public ProductEntity() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
 
  
 
  

}
