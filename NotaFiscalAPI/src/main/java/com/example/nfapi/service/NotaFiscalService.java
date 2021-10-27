package com.example.nfapi.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.nfapi.entity.NotaFiscalEletronica;
import com.example.nfapi.entity.NotaFiscalEletronicaDTO;
import com.example.nfapi.repository.RepositoryNotaFiscal;

@Service
public class NotaFiscalService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private RepositoryNotaFiscal repository;
	
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
