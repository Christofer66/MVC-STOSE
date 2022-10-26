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

	@Value("${title.tienda}")
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
		
		//Libros y categorias
		
		Lista LibrosC = new Lista();
		LibrosC.setArte("Arte");
		LibrosC.setBiografias("Biografias");
		LibrosC.setCiencias("Ciencias");
		LibrosC.setComputacion("Computacion");
		LibrosC.setDeportes("Deportes");
		LibrosC.setDerecho("Derecho");
		LibrosC.setEconomia("Economia");
		LibrosC.setEstilosDeVida("Estilos de Vida");
		LibrosC.setFiccion("Ficcion");
		LibrosC.setFilosofiaYreligion("Filosofia y Religion");
		LibrosC.setInfantilesYjuveniles("Infantiles y Juveniles");
		
		
		List<Lista> ListLibrosC = new ArrayList<>();
		ListLibrosC.add(LibrosC);
		
		//Metodos de pago
		
		Lista MetodosP = new Lista();
		MetodosP.setTarjetasDeCredito("Tarjetas de Credito");
		MetodosP.setPaypal("Paypal");
		
		List<Lista> ListMetodosP = new ArrayList<>();
		ListMetodosP.add(MetodosP);
		
		//Sobre Nosotros
		
		Lista Nosotros = new Lista();
		Nosotros.setIempresa("Informacion de la Compañia");
		Nosotros.setNoticias("Noticias");
		Nosotros.setInversores("Inversores");
		Nosotros.setPolíticas("Políticas");
		Nosotros.setClienteV("Valoracion de los clientes");
		
		
		List<Lista> ListNosotros = new ArrayList<>();
		ListNosotros.add(Nosotros);
		
		model.addAttribute("Nosotros", ListNosotros);
		model.addAttribute("MetodosP", ListMetodosP);
		model.addAttribute("LibrosC", ListLibrosC);
		model.addAttribute("AyudaC", ListAyudaC);	
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Titulo", "Tienda");
		model.addAttribute("Libros", "La divina comedia");


		return "tienda";

	}

}
