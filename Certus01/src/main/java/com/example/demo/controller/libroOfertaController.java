package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/app")
public class libroOfertaController {

    @Value("${title.librooferta}")
    private String titlePage;

    @GetMapping({ "/libro-oferta", "/Libro-Oferta"})
    public String LibroOferta(Model model) {

        return "libro-oferta";
    }
}
