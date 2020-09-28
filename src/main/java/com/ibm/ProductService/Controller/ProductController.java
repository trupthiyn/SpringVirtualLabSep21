package com.ibm.ProductService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // spring boot understands that its a controller and looks for all the APIs
public class ProductController {
	
	@GetMapping("/product")
	public String message() {
		return "Welcome to SpringBoot";
	}

}
