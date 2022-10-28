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
public class indexController {

	@Value("${title.index}")
	private String TitlePage;

	@GetMapping({ "/inicio", "/", "Inicio" })
	public String ControllerIndex(Model model) {
		
		//SECCION Carrito de compras
		indexModel CarritoC = new indexModel();
		CarritoC.setCarritoCompras1("Contra el futuro");
		CarritoC.setCarritoCompras2("Dataclismo");
		CarritoC.setCarritoCompras3("El enemigo conoce el sistema");
		CarritoC.setCarritoCompras4("Manipulados");
		
		List<indexModel> ListCarritoC = new ArrayList<>();
		ListCarritoC.add(CarritoC);
		

		//SECCION Libros en Tendencia
		//Libro en Oferta
		indexModel LibroO = new indexModel();
		LibroO.setLibroOferta("La Divina Comedia");
		
		List<indexModel> ListLibroO = new ArrayList<>();
		ListLibroO.add(LibroO);

		//Libros en Tendencia
		indexModel LibroT = new indexModel();
		LibroT.setLibroTendencia1("Cambiemos el Mundo");
		LibroT.setLibroTendencia2("Como evitar un desastre climatica");
		LibroT.setLibroTendencia3("En el Mapa");
		LibroT.setLibroTendencia4("La Gramática de la Arquitectura");
		LibroT.setLibroTendencia5("Robin la Rebelde");
		LibroT.setLibroTendencia6("El camino del artista");
		LibroT.setLibroTendencia7("Delirio americano");
		LibroT.setLibroTendencia8("El arte de escuchar");
		
		List<indexModel> ListLibroT = new ArrayList<>();
		ListLibroT.add(LibroT);


		//SECCION LIBROS DESTACADOS
		//Libros Destacados
		indexModel LibroD = new indexModel();
		LibroD.setLibroDestacado1("Las Vidas Secretas del Color");
		LibroD.setLibroDestacado2("El Hilo Dorado");
		LibroD.setLibroDestacado3("Nuestra Casa Esta Ardiendo");
		LibroD.setLibroDestacado4("Cómo evitar la próxima pandemia");
		LibroD.setLibroDestacado5("Siervas");
		LibroD.setLibroDestacado6("Paula");
		LibroD.setLibroDestacado7("El Placer de la Lectura");
		LibroD.setLibroDestacado8("Hamlet");

		List<indexModel> ListLibroD = new ArrayList<>();
		ListLibroD.add(LibroD);


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
        model.addAttribute("TituloPagina", TitlePage);
		model.addAttribute("AyudaC", ListAyudaC);	
		model.addAttribute("LibrosC", ListLibrosC);
		model.addAttribute("MetodosP", ListMetodosP);
		model.addAttribute("Nosotros", ListNosotros);
		model.addAttribute("LibroO", ListLibroO);
		model.addAttribute("LibroT", ListLibroT);
		model.addAttribute("LibroD", ListLibroD);
		model.addAttribute("CarritoC", ListCarritoC);

        return "index";
    }
}