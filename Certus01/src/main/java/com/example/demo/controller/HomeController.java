package com.example.demo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Lista;



import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/app")
public class HomeController {

	@Value("${title.generic}")
	private String titlePage;

	@GetMapping({ "/home", "/inicio", "/", "/Home", "Inicio" })
	public String HolaMundo(Model model) {

		//Ayuda y contacto
		Lista AyudaC = new Lista();
		AyudaC.setCuenta("Tu Cuenta");
		AyudaC.setPedidos("Tus Pedidos");
		AyudaC.setEnvios("Tarifas de Envio");
		AyudaC.setDevoluciones("Devoluciones");
		AyudaC.setContactanos("Contactanos");
		
		
		List<Lista> ListAyudaC = new ArrayList<>();
		ListAyudaC.add(AyudaC);


		model.addAttribute("AyudaC", ListAyudaC);	
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Titulo", "Tienda");
		model.addAttribute("Libros", "La divina comedia");


		return "tienda";

	}

}
