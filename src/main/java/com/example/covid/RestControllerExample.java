package com.example.covid;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestControllerExample {
	
	 @RequestMapping("/restExample")
	    public String hello() {
	        return "Rest Example";
	    }
	 
	 

}
