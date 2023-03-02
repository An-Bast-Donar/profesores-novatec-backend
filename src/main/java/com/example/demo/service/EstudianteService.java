package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Estudiante;

public interface EstudianteService {
	List<Estudiante> findAll();
	Estudiante findById(int id);
	Estudiante save(Estudiante estudiante);
	Estudiante update(int id, Estudiante estudiante);
    void deleteById(int id);
}
