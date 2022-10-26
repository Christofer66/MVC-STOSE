package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class DetalleLibroController {
	
	@Value("${title.detallelibro}")
	private String titlePage;
	
	@GetMapping({"/detalle-libro","/","/Detalle-Libro"})
	public String DetalleLibro() {
		
		return "detalle-libro";
	}
}
