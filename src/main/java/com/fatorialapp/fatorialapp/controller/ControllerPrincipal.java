package com.fatorialapp.fatorialapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatorialapp.fatorialapp.models.RequestDTO;

@RestController
public class ControllerPrincipal {
	
	@PostMapping(path = "/fatorial")
	public ResponseEntity<Long> teste(@RequestBody RequestDTO request){
		Long number = calculaFatorial(request.getNumber());
		return ResponseEntity.status(HttpStatus.OK).body(number);
	}
	
	 private Long calculaFatorial(int number) {
		 if (number == 0) {
			 return (long) 1;
		 }    
		 return number * calculaFatorial(number - 1);
	 }

	 

}
