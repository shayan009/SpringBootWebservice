package com.sample.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.entity.ProductEntity;
import com.sample.demo.entity.ResponseData;
import com.sample.demo.service.ProductServiceImpl;

import net.minidev.json.JSONObject;


@RestController
public class ProductController {


		@Autowired
		private ProductServiceImpl applicationService;	
	
	
	
	@PostMapping(value="/addProduct")
    public ResponseEntity<ResponseData> createVehicle(@RequestBody ProductEntity productEntity){
	ProductEntity entity=	applicationService.insertProduct(productEntity);
	
	ResponseData responseData=new ResponseData();
	if(entity!=null) {
		responseData.setStatus(true);
		responseData.setMessage("Product Inserted");
     	responseData.setEntity(entity);
	}
	else {
		responseData.setStatus(false);
		responseData.setMessage("Product Not Inserted");
	}
	return new ResponseEntity<>(responseData,HttpStatus.CREATED);

    }
	
	

	  /**
	   * Update product response entity.
	  
	   */
	  @PutMapping("/product/{id}")
	  public ResponseEntity<ResponseData> updateProduct(@PathVariable(value = "id") int userId, @Valid @RequestBody ProductEntity productEntity) {
	   
		  Optional<ProductEntity> entity=applicationService.findUserById(userId);
			System.out.println("EnterProducts!!!!!!!!!!!!!");	  
		  ResponseData responseData=new ResponseData();
			if(entity.isPresent()) {
				responseData.setStatus(true);
				responseData.setMessage("Product Found");
				
				entity.get().setName(productEntity.getName());
				entity.get().setPrice(productEntity.getPrice());
		     	responseData.setEntity(applicationService.insertProduct(productEntity));
			}
			else {
				responseData.setStatus(false);
				responseData.setMessage("Product Not Found");
			}
		  
			return new ResponseEntity<>(responseData,HttpStatus.CREATED);
	  }
	
	
	@GetMapping("/products")
	public ResponseEntity<JSONObject> list() {
	
		
		ResponseData responseData=new ResponseData();
		List<ProductEntity> productEntities=applicationService.listAll();
		System.out.println("EnterProducts!!!!!!!!!!!!!"+productEntities.size());
		JSONObject obj=new JSONObject();
		
		if(productEntities.size()>0) {
			obj.put("status", true);
			obj.put("message", "Product Found");
			obj.put("data",productEntities);
			//responseData.setStatus(true);
			//responseData.setMessage("Product Found");
	     	//responseData.setListEnity(productEntities);
		}
		else {
		
			obj.put("status", true);
			obj.put("message", "Product Not Found");
			//responseData.setStatus(false);
			//responseData.setMessage("Product Not Found");
		}
		
		return new ResponseEntity<>(obj,HttpStatus.OK);
		
	}
}
