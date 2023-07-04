package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepository doctorRepository;
	@Override
	public void agregar(Doctor doctor) {
		this.doctorRepository.insertar(doctor);

	}

	@Override
	public Doctor buscar(Integer id) {
		return this.doctorRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Integer id) {
		this.doctorRepository.actualizar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.doctorRepository.eliminar(id);
	}
	

}
