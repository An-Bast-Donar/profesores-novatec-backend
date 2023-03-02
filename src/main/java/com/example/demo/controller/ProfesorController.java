package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Profesor;
import com.example.demo.service.ProfesorService;

@RestController
@RequestMapping("/api/Profesores")
public class ProfesorController {
	
	@Autowired
    private ProfesorService profesorService;

    @GetMapping("")
    public List<Profesor> findAll() {
        return profesorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesor> findById(@PathVariable int id) {
    	Profesor profesor = profesorService.findById(id);
        if (profesor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(profesor);
    }

    @PostMapping("")
    public ResponseEntity<Profesor> create(@RequestBody Profesor profesor) {
    	Profesor nuevoProfesor = profesorService.save(profesor);
        return ResponseEntity.created(null).body(nuevoProfesor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> update(@PathVariable int id, @RequestBody Profesor profesor) {
    	Profesor profesorActualizado = profesorService.update(id, profesor);
        if (profesorActualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(profesorActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
    	profesorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
