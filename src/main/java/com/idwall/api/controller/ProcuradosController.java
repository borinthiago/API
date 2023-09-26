package com.idwall.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idwall.api.model.Procurados;
import com.idwall.api.repository.ProcuradosRepository;

@RestController
@RequestMapping("/procurados")
public class ProcuradosController {

	@Autowired
	private ProcuradosRepository procuradosRepository;
	
	
	@GetMapping
	public List<Procurados> listar(){
		return procuradosRepository.findAll();
	}
		
}
