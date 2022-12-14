package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.libroOfertaModel;
import com.example.demo.models.tiendaModel;

@Controller
@RequestMapping("/app")
public class libroOfertaController {

    @Value("${title.librooferta}")
    private String titlePage;

    @GetMapping({ "/libro-oferta", "Libro-Oferta" })
    public String LibroOferta(Model model) {
    	
    	//SECCION Carrito de compras
    	libroOfertaModel CarritoC = new libroOfertaModel();
    	CarritoC.setCarritoCompras1("Contra el futuro");
        CarritoC.setCarritoCompras2("Dataclismo");
    	CarritoC.setCarritoCompras3("El enemigo conoce el sistema");
    	CarritoC.setCarritoCompras4("Manipulados");
    			
    	List<libroOfertaModel> ListCarritoC = new ArrayList<>();
        ListCarritoC.add(CarritoC);
    	
    	//DETALLE LIBROS
		
    	libroOfertaModel DetalleLibro = new libroOfertaModel();
		
		DetalleLibro.setTitulo("La Divina Comedia");
		DetalleLibro.setAutor("Dante Alighieri - Akal");
		
		List<libroOfertaModel> ListDetalleLibro = new ArrayList<>();
		ListDetalleLibro.add(DetalleLibro);
		
		//DESCRIPCION
		
		libroOfertaModel Descripcion = new libroOfertaModel();
		
		Descripcion.setContenido("Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro, iure quas optio necessitatibus aperiam sed tempora amet assumenda ducimus excepturi nobis omnis ad expedita saepe odit delectus placeat maxime corporis.");
		
		List<libroOfertaModel> ListDescripcion = new ArrayList<>();
		ListDescripcion.add(Descripcion);
		
		//INFORMACION
		libroOfertaModel Informacion = new libroOfertaModel();
		
		Informacion.setAutorInfo("  Dante Alighieri");
		Informacion.setCategoria("Poesía, Ficción Clásica");
		Informacion.setAnoPublicacion("2021");
		Informacion.setEditorial("Akal");
		Informacion.setNumeroPaginas("832");
		
		List<libroOfertaModel> ListInformacion = new ArrayList<>();
		ListInformacion.add(Informacion);
    	
    	
    	//LIBROS RELACIONADOS
    	libroOfertaModel LibroR = new libroOfertaModel();
		
		LibroR.setLibroRelacionado1("Chernobil Herbarium");
		LibroR.setLibroRelacionado2("Los primeros hominidos");
		LibroR.setLibroRelacionado3("¿Que puede salir mal?");
		LibroR.setLibroRelacionado4("Cómo evitar un desastre climático");
		LibroR.setLibroRelacionado5("Quimica del suelo");
		LibroR.setLibroRelacionado6("Atlas de la biblia");
		LibroR.setLibroRelacionado7("Nuevas realidades territoriales para el siglo XXI");
		LibroR.setLibroRelacionado8("Psicogeografía");
		
		List<libroOfertaModel> ListLibroR = new ArrayList<>();
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
	    model.addAttribute("DetalleLibro", ListDetalleLibro);
	    model.addAttribute("Descripcion", ListDescripcion);
	    model.addAttribute("Informacion", ListInformacion);
	    model.addAttribute("LibroR", ListLibroR);
	    model.addAttribute("CarritoC", ListCarritoC);

        return "libro-oferta";
    }
}
