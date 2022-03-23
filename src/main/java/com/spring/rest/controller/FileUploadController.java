package com.spring.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.rest.model.FileDetails;

@RestController
public class FileUploadController {
	@RequestMapping(value= "/upload", method = RequestMethod.POST, consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> uploadFile(@RequestPart("form") FileDetails fileDetails,
			@RequestPart(required=false) MultipartFile file){
		
		System.out.println(fileDetails.toString());
		if(file!=null) {
//	    	System.out.println(file.getOriginalFilename());
			return ResponseEntity.ok(fileDetails.toString() +" FileName : " + file.getOriginalFilename());
		}
		else {
			return ResponseEntity.ok(fileDetails.toString() +" FileName : " + "");
		}
	  } 
}