package com.alicie.prjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depcodigo;
	
	@NotBlank
	@NotNull
	private String depnome;
	
	
	public Departamento() {
		
	}
	
	
	public Departamento(Long depcodigo, @NotNull @NotBlank String depnome) {
		super();
		this.depcodigo = depcodigo;
		this.depnome = depnome;

	}

	public Long getDepcodigo() {
		return depcodigo;
	}


	public void setDepcodigo(Long depcodigo) {
		this.depcodigo = depcodigo;
	}


	public String getDepnome() {
		return depnome;
	}


	public void setDepnome(String depnome) {
		this.depnome = depnome;
	}

}
