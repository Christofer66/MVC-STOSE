package com.example.demo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.tiendaModel;



import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/app")
public class tiendaController {

	@Value("${title.tienda}")
	private String titlePage;

	@GetMapping({ "/tienda", "Tienda" })
	public String Tienda(Model model) {

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
		Nosotros.setPoliticas("Políticas");
		Nosotros.setClienteV("Valoracion de los clientes");
		
		
		List<tiendaModel> ListNosotros = new ArrayList<>();
		ListNosotros.add(Nosotros);
		
		//Header top
		
		
		tiendaModel HeaderT = new tiendaModel();
		HeaderT.setBlog("Blog");
		HeaderT.setProductosDestacados("Productos Destacados");
		HeaderT.setListaDeDeseos("Lista de deseos");
		HeaderT.setRegistrate("Registrate");
		HeaderT.setMiCuenta("Mi cuenta");
		HeaderT.setRevisionDePedidos("Revision de Pedidos");
		
		
		List<tiendaModel> ListHeaderT = new ArrayList<>();
		ListHeaderT.add(HeaderT);
		
		//Header nav
		
		tiendaModel HeaderN = new tiendaModel();
		HeaderN.setInicio("Inicio");
		HeaderN.setTienda("Tienda");
		HeaderN.setCostoDeEnvio("Costo de envios");
		HeaderN.setNosotros("Nosotros");
		
		
		List<tiendaModel> ListHeaderN = new ArrayList<>();
		ListHeaderN.add(HeaderN);
		
		model.addAttribute("HeaderT", ListHeaderN);
		model.addAttribute("HeaderT", ListHeaderT);
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
