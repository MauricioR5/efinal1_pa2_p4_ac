package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteService {

	public void agregar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void actualizar(Integer id);
	public void borrar(Integer id);
}
