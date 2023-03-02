package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Profesor;

public interface ProfesorService {
	List<Profesor> findAll();
	Profesor findById(int id);
	Profesor save(Profesor profesor);
	Profesor update(int id, Profesor profesor);
    void deleteById(int id);
}
