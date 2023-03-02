package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Profesor;
import com.example.demo.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	@Autowired
	private ProfesorRepository profesorRepository;

	@Override
	public List<Profesor> findAll() {
		return profesorRepository.findAll();
	}

	@Override
	public Profesor findById(int id) {
		return profesorRepository.findById(id).orElse(null);
	}

	@Override
	public Profesor save(Profesor profesor) {
		return profesorRepository.save(profesor);
	}

	@Override
	public Profesor update(int id, Profesor profesor) {
		profesor.setId(id);
		return profesorRepository.save(profesor);
	}

	@Override
	public void deleteById(int id) {
		profesorRepository.deleteById(id);
	}
}
