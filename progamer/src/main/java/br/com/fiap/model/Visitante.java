package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_visitante;
	private String nm_visitante;
	private LocalDate dt_nasc; 
	private String nr_cpf;
	private String nr_rg;
	private String nm_digito_rg;
	private LocalDate dt_cadastro;
	private String imagePath;
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		// TODO Auto-generated method stub
		this.imagePath = imagePath;
		
	}

	public Long getId_visitante() {
		return id_visitante;
	}

	public void setId_visitante(Long id_visitante) {
		this.id_visitante = id_visitante;
	}

	public String getNm_visitante() {
		return nm_visitante;
	}

	public void setNm_visitante(String nm_visitante) {
		this.nm_visitante = nm_visitante;
	}

	public LocalDate getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(LocalDate dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getNr_cpf() {
		return nr_cpf;
	}

	public void setNr_cpf(String nr_cpf) {
		this.nr_cpf = nr_cpf;
	}

	public String getNr_rg() {
		return nr_rg;
	}

	public void setNr_rg(String nr_rg) {
		this.nr_rg = nr_rg;
	}

	public String getNm_digito_rg() {
		return nm_digito_rg;
	}

	public void setNm_digito_rg(String nm_digito_rg) {
		this.nm_digito_rg = nm_digito_rg;
	}

	public LocalDate getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(LocalDate dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	@Override
	public String toString() {
		return "Visitante [id_visitante=" + id_visitante + ", nm_visitante=" + nm_visitante + ", dt_nasc=" + dt_nasc
				+ ", nr_cpf=" + nr_cpf + ", nr_rg=" + nr_rg + ", nm_digito_rg=" + nm_digito_rg + ", dt_cadastro="
				+ dt_cadastro + ", imagePath=" + imagePath + "]";
	}
	
	

}
