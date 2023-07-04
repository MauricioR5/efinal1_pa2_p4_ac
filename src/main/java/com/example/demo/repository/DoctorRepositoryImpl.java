package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor seleccionar(Integer id) {
		
		return this.entityManager.find(Doctor.class,id);
	}

	@Override
	public void actualizar(Integer id) {
		Doctor doc = this.seleccionar(id);
		this.entityManager.merge(doc);
		
	}

	@Override
	public void eliminar(Integer id) {
		Doctor doc = this.seleccionar(id);
		this.entityManager.remove(doc);		
	}



}
