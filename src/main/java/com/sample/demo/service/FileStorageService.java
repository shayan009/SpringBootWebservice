package com.sample.demo.service;

import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface FileStorageService {

	String storeFile(MultipartFile file);

	Resource loadFileAsResource(String fileName);
	 
}
