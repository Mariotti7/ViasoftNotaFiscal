package com.example.apinfe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apinfe.model.NFE;
import com.example.apinfe.model.NFEDTO;
import com.example.apinfe.repository.RepositoryNFE;

@RestController
@RequestMapping("/api/nfe")
public class ControllerNFE {

	@Autowired
	private RepositoryNFE repo;
	
	@PostMapping()
	public NFE savenfe(@RequestBody NFEDTO dto) {

		NFE notaFiscalEletronica = new NFE();

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

		return repo.save(notaFiscalEletronica);
	}

}
