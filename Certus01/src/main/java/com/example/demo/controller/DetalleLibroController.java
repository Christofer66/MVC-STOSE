package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.indexModel;
import com.example.demo.models.tiendaModel;

@Controller
@RequestMapping("/app")
public class DetalleLibroController {
	
	@Value("${title.detallelibro}")
	private String titlePage;
	
	@GetMapping({"/detalle-libro", "/Detalle-Libro"})
	public String DetalleLibro(Model model) {
		
		//SECCION detalle-libros
		//Imagen de libro grande
		
		indexModel ImagenLibroG = new indexModel();
		
		List<indexModel> ListImagenLibroG = new ArrayList<>();
		ListImagenLibroG.add(ImagenLibroG);
		
		//SECCION libros relacionados
		//Libros relacionados
		
		indexModel LibroR = new indexModel();
		
		List<indexModel> ListLibroR = new ArrayList<>();
		ListLibroR.add(LibroR);
		
		//CONTENIDO DEL FOOTER
		//Ayuda y contacto
		tiendaModel AyudaC = new tiendaModel();
		AyudaC.setCuenta("Tu Cuenta");
		AyudaC.setPedidos("Tus Pedidos");
		AyudaC.setEnvios("Tarifas de Envio");
		AyudaC.setDevoluciones("Devoluciones");
		AyudaC.setContactanos("Contactanos");
						
						
		List<tiendaModel> ListAyudaC = new ArrayList<>();
		ListAyudaC.add(AyudaC);
		
		//Libros y categorias
		tiendaModel LibrosC = new tiendaModel();
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
		
		List<tiendaModel> ListLibrosC = new ArrayList<>();
		ListLibrosC.add(LibrosC);
		
		//Metodos de pago
	    tiendaModel MetodosP = new tiendaModel();
	    MetodosP.setTarjetasDeCredito("Tarjetas de Credito");
	    MetodosP.setPaypal("Paypal");
						
	    List<tiendaModel> ListMetodosP = new ArrayList<>();
	    ListMetodosP.add(MetodosP);
		
	    //Sobre Nosotros
	    tiendaModel Nosotros = new tiendaModel();
	    Nosotros.setIempresa("Informacion de la Compañia");
	    Nosotros.setNoticias("Noticias");
	    Nosotros.setInversores("Inversores");
	    Nosotros.setPoliticas("Politicas");
	    Nosotros.setClienteV("Valoracion de los clientes");
						
	    List<tiendaModel> ListNosotros = new ArrayList<>();
	    ListNosotros.add(Nosotros);
		
	    //Models 
	    model.addAttribute("TituloPagina", titlePage);
	    model.addAttribute("AyudaC", ListAyudaC);	
	    model.addAttribute("LibrosC", ListLibrosC);
	    model.addAttribute("MetodosP", ListMetodosP);
	    model.addAttribute("Nosotros", ListNosotros);
	    model.addAttribute("ImagenLibroG", ListImagenLibroG);
	    model.addAttribute("LibroR", ListLibroR);
	    
		return "detalle-libro";
	}
}
