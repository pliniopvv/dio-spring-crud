package br.com.pvv.dio.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloREST {

	@GetMapping("/hello")
	public String getHelloWord() {
		return "Hello Word";
	}
	
	
}
