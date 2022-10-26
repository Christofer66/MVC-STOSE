package com.example.demo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.indexModel;



import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/index")
public class indexController {

	@Value("${title.index}")
	private String titlePage;

	@GetMapping({ "/home", "/inicio", "/", "/Home", "Inicio" })
	public String ControllerIndex(Model model) {
        
        //Libros y categorias
		
		indexModel LibrosC = new indexModel();
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

        List<indexModel> ListLibrosC = new ArrayList<>();
		ListLibrosC.add(LibrosC);
        
        model.addAttribute("TituloPagina", titlePage);

        return "index";
    }
}