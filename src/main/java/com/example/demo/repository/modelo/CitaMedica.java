package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "citaMedica")
public class CitaMedica {

	@GeneratedValue(generator = "seq_citaMedica", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_citaMedica",sequenceName = "seq_citaMedica", allocationSize = 1)
	
	@Id
	@Column(name = "cime_id")
	private Integer id;
	
	@Column(name = "cime_numero_cita")
	private String numCita;
	
	@Column(name = "cime_fecha_cita")
	private LocalDateTime fechaCita;
	
	@Column(name = "cime_valor_cita")
	private BigDecimal valorCita;
	
	@Column(name = "cime_lugar_cita")
	private BigDecimal lugarCita;
	
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	
	@Column(name = "cime_receta")
	private String receta;
	
	@Column(name = "cime_fecha_proxima_cita")
	private LocalDateTime fechaProxCita;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cime_doct_id")
	private Doctor doctor;
	
	//SET AND GET 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumCita() {
		return numCita;
	}
	public void setNumCita(String numCita) {
		this.numCita = numCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getValorCita() {
		return valorCita;
	}
	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}
	public BigDecimal getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(BigDecimal lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getFechaProxCita() {
		return fechaProxCita;
	}
	public void setFechaProxCita(LocalDateTime fechaProxCita) {
		this.fechaProxCita = fechaProxCita;
	}
	
	}
	
