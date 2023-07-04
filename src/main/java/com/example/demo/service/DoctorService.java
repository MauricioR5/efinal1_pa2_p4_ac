package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorService {
	
	public void agregar(Doctor doctor);
	public Doctor buscar(Integer id);
	public void actualizar(Integer id);
	public void borrar(Integer id);

}
