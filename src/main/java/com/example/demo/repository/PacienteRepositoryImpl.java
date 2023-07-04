package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository{

	@PersistenceContext
	
	private EntityManager entityManager;
	@Override
	public void insertar(Paciente paciente) {
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente seleccionar(Integer id) {
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizar(Integer id) {
		Paciente paciente = this.seleccionar(id);
		this.entityManager.merge(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		Paciente paciente = this.seleccionar(id);
		this.entityManager.remove(paciente);
	}

}
