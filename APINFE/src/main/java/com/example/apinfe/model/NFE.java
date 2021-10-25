package com.example.apinfe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tb_nfe")
public class NFE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String colunas;
	private String linhaImparAM;
	private String linhaParBA;
	private String linhaImparCE;
	private String linhaParGO;
	private String linhaImparMG;
	private String linhaParMS;
	private String linhaImparMT;
	private String linhaParPE;
	private String linhaImparPR;
	private String linhaParRS;
	private String linhaImparSP;
	private String linhaParSVAN;
	private String linhaImparSVRS;
	private String linhaParSVCAAN;
	private String linhaImparSVCRRS;

	public NFE() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColunas() {
		return colunas;
	}

	public void setColunas(String colunas) {
		this.colunas = colunas;
	}

	public String getLinhaImparAM() {
		return linhaImparAM;
	}

	public void setLinhaImparAM(String linhaImparAM) {
		this.linhaImparAM = linhaImparAM;
	}

	public String getLinhaParBA() {
		return linhaParBA;
	}

	public void setLinhaParBA(String linhaParBA) {
		this.linhaParBA = linhaParBA;
	}

	public String getLinhaImparCE() {
		return linhaImparCE;
	}

	public void setLinhaImparCE(String linhaImparCE) {
		this.linhaImparCE = linhaImparCE;
	}

	public String getLinhaParGO() {
		return linhaParGO;
	}

	public void setLinhaParGO(String linhaParGO) {
		this.linhaParGO = linhaParGO;
	}

	public String getLinhaImparMG() {
		return linhaImparMG;
	}

	public void setLinhaImparMG(String linhaImparMG) {
		this.linhaImparMG = linhaImparMG;
	}

	public String getLinhaParMS() {
		return linhaParMS;
	}

	public void setLinhaParMS(String linhaParMS) {
		this.linhaParMS = linhaParMS;
	}

	public String getLinhaImparMT() {
		return linhaImparMT;
	}

	public void setLinhaImparMT(String linhaImparMT) {
		this.linhaImparMT = linhaImparMT;
	}

	public String getLinhaParPE() {
		return linhaParPE;
	}

	public void setLinhaParPE(String linhaParPE) {
		this.linhaParPE = linhaParPE;
	}

	public String getLinhaImparPR() {
		return linhaImparPR;
	}

	public void setLinhaImparPR(String linhaImparPR) {
		this.linhaImparPR = linhaImparPR;
	}

	public String getLinhaParRS() {
		return linhaParRS;
	}

	public void setLinhaParRS(String linhaParRS) {
		this.linhaParRS = linhaParRS;
	}

	public String getLinhaImparSP() {
		return linhaImparSP;
	}

	public void setLinhaImparSP(String linhaImparSP) {
		this.linhaImparSP = linhaImparSP;
	}

	public String getLinhaParSVAN() {
		return linhaParSVAN;
	}

	public void setLinhaParSVAN(String linhaParSVAN) {
		this.linhaParSVAN = linhaParSVAN;
	}

	public String getLinhaImparSVRS() {
		return linhaImparSVRS;
	}

	public void setLinhaImparSVRS(String linhaImparSVRS) {
		this.linhaImparSVRS = linhaImparSVRS;
	}

	public String getLinhaParSVCAAN() {
		return linhaParSVCAAN;
	}

	public void setLinhaParSVCAAN(String linhaParSVCAAN) {
		this.linhaParSVCAAN = linhaParSVCAAN;
	}

	public String getLinhaImparSVCRRS() {
		return linhaImparSVCRRS;
	}

	public void setLinhaImparSVCRRS(String linhaImparSVCRRS) {
		this.linhaImparSVCRRS = linhaImparSVCRRS;
	}

}
