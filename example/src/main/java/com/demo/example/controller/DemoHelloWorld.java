package com.demo.example.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class DemoHelloWorld {

	  
	  @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
	  public @ResponseBody ResponseEntity<String> checkTestMapping(@RequestBody MultipartFile file){
		  System.out.println(file);
		  return null; 
		  
	  }

	}
















