package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepository {

	public void insertar(Paciente paciente);
	public Paciente seleccionar(Integer id);
	public void actualizar(Integer id);
	public void eliminar(Integer id);
}
