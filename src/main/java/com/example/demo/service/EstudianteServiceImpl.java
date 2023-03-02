package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Estudiante;
import com.example.demo.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public List<Estudiante> findAll() {
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante findById(int id) {
		return estudianteRepository.findById(id).orElse(null);
	}

	@Override
	public Estudiante save(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	@Override
	public Estudiante update(int id, Estudiante estudiante) {
		estudiante.setId(id);
		return estudianteRepository.save(estudiante);
	}

	@Override
	public void deleteById(int id) {
		estudianteRepository.deleteById(id);
	}

}
