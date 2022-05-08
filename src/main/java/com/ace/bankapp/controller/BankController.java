package com.ace.bankapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@Value("${app.requestRate}")
	public String value;
	
	@GetMapping("/test")
	public ResponseEntity<String>  test() {
		
		return ResponseEntity.ok(value);
		
	}

}
