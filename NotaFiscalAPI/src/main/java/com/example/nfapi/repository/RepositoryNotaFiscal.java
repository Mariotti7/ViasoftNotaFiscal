package com.example.nfapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nfapi.entity.NotaFiscalEletronica;

public interface RepositoryNotaFiscal extends JpaRepository<NotaFiscalEletronica, Long>{
	
	
}
