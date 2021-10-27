package com.example.nfapi.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nfapi.entity.NotaFiscalEletronica;
import com.example.nfapi.entity.NotaFiscalEletronicaDTO;
import com.example.nfapi.repository.RepositoryNotaFiscal;
import com.example.nfapi.service.NotaFiscalService;

@RestController
@RequestMapping("/api/nf")
public class NotaFiscalController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private RepositoryNotaFiscal repository;

	@Autowired
	private NotaFiscalService service;
	
	@GetMapping
	public List<NotaFiscalEletronica> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<NotaFiscalEletronica> saveNota(@RequestBody NotaFiscalEletronicaDTO notaFiscal) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.savenfe(notaFiscal));
	}
}