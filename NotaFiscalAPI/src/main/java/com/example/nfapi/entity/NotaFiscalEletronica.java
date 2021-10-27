package com.example.nfapi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_nfe")
@Getter
@Setter
@EqualsAndHashCode
public class NotaFiscalEletronica implements Serializable{

	private static final long serialVersionUID = 1L;
	
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

}
