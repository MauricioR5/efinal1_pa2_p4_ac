package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class efinal1_pa2_p4_ac implements CommandLineRunner{

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PacienteService pacienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(efinal1_pa2_p4_ac.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Ingreso doctor
		Doctor doc1 = new Doctor();
		doc1.setCedula("1723524664");
		doc1.setNombre("Alexander");
		doc1.setApellido("Cacuango");
		doc1.setFechaNacimiento(LocalDateTime.of(1999,05,05,02,30));
		doc1.setNumeroConsultorio("5");
		doc1.setCodSenescyt("55555");
		doc1.setGenero("Cardiologia");
		
		//this.doctorService.agregar(doc1);
		
		//Ingreso Paciente
		
		Paciente paciente1 = new Paciente();
		paciente1.setCedula("165165165");
		paciente1.setNombre("Rodrigo");
		paciente1.setApellido("Perez");
		paciente1.setFechaNacimiento(LocalDateTime.of(2000,02,06,12,20));
		paciente1.setCodigoSeguro("485568");
		paciente1.setEstatura("1.60");
		paciente1.setPeso("80");
		paciente1.setGenero("masculino");
		
		this.pacienteService.agregar(paciente1);
		
	}
}
