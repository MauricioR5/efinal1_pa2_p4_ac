package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
	@Table(name = "doctor")
	public class Doctor {

		@GeneratedValue(generator = "seq_doctor", strategy = GenerationType.SEQUENCE)
		@SequenceGenerator(name = "seq_doctor",sequenceName = "seq_doctor", allocationSize = 1)
		
		@Id
		@Column(name = "doct_id")
		private Integer id;
		
		@Column(name = "doct_cedula")
		private String cedula;
		
		@Column(name = "doct_nombre")
		private String nombre;
		
		@Column(name = "doct_apellido")
		private String apellido;
		
		@Column(name = "doct_fechaNacimiento")
		private LocalDateTime fechaNacimiento;
		
		@Column(name = "doct_numeroConsultorio")
		private String numeroConsultorio;
		
		@Column(name = "doct_codigo_senescyt")
		private String codSenescyt;
		
		@Column(name = "doct_genero")
		private String genero;
		
		@OneToMany(mappedBy = "doctor" , cascade = CascadeType.ALL)
		
		List<CitaMedica> citasMedicas;

		//SET AND GET
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public LocalDateTime getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getNumeroConsultorio() {
			return numeroConsultorio;
		}

		public void setNumeroConsultorio(String numeroConsultorio) {
			this.numeroConsultorio = numeroConsultorio;
		}

		public String getCodSenescyt() {
			return codSenescyt;
		}

		public void setCodSenescyt(String codSenescyt) {
			this.codSenescyt = codSenescyt;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		@Override
		public String toString() {
			return "Doctor [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
					+ fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio + ", codSenescyt=" + codSenescyt
					+ ", genero=" + genero + ", citasMedicas=" + citasMedicas + "]";
		}
		
		
		
		
}
		