package com.example.nfapi.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nfapi.entity.NotaFiscalEletronica;
import com.example.nfapi.entity.NotaFiscalEletronicaDTO;
import com.example.nfapi.repository.RepositoryNotaFiscal;

@RestController
@RequestMapping("/api/nf")
public class NotaFiscalController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private RepositoryNotaFiscal repository;
	
	
	@GetMapping
	public List<NotaFiscalEletronica> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public NotaFiscalEletronica savenfe(@RequestBody NotaFiscalEletronicaDTO dto) {

		NotaFiscalEletronica notaFiscalEletronica = new NotaFiscalEletronica();

		notaFiscalEletronica.setColunas(dto.getColunas());
		notaFiscalEletronica.setLinhaImparAM(dto.getLinhaImparAM());
		notaFiscalEletronica.setLinhaParBA(dto.getLinhaParBA());
		notaFiscalEletronica.setLinhaImparCE(dto.getLinhaImparCE());
		notaFiscalEletronica.setLinhaParGO(dto.getLinhaParGO());
		notaFiscalEletronica.setLinhaImparMG(dto.getLinhaImparMG());
		notaFiscalEletronica.setLinhaParMS(dto.getLinhaParMS());
		notaFiscalEletronica.setLinhaImparMT(dto.getLinhaImparMT());
		notaFiscalEletronica.setLinhaParPE(dto.getLinhaParPE());
		notaFiscalEletronica.setLinhaImparPR(dto.getLinhaImparPR());
		notaFiscalEletronica.setLinhaParRS(dto.getLinhaParRS());
		notaFiscalEletronica.setLinhaImparSP(dto.getLinhaImparSP());
		notaFiscalEletronica.setLinhaParSVAN(dto.getLinhaParSVAN());
		notaFiscalEletronica.setLinhaImparSVRS(dto.getLinhaImparSVRS());
		notaFiscalEletronica.setLinhaParSVCAAN(dto.getLinhaParSVCAAN());
		notaFiscalEletronica.setLinhaImparSVCRRS(dto.getLinhaImparSVCRRS());

		return repository.save(notaFiscalEletronica);

}
}