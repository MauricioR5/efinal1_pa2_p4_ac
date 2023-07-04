package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{

	@Autowired
	PacienteRepository pacienteRepository;
	@Override
	public void agregar(Paciente paciente) {
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		return this.pacienteRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Integer id) {
		this.pacienteRepository.actualizar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.pacienteRepository.eliminar(id);
	}

}
