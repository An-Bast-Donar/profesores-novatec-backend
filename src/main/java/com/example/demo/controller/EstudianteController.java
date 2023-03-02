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

import com.example.demo.entity.Estudiante;
import com.example.demo.service.EstudianteService;

@RestController
@RequestMapping("/api/Estudiantes")
public class EstudianteController {
	
	@Autowired
    private EstudianteService estudianteService;

    @GetMapping("")
    public List<Estudiante> findAll() {
        return estudianteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> findById(@PathVariable int id) {
    	Estudiante estudiante = estudianteService.findById(id);
        if (estudiante == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estudiante);
    }

    @PostMapping("")
    public ResponseEntity<Estudiante> create(@RequestBody Estudiante estudiante) {
    	Estudiante nuevoEstudiante = estudianteService.save(estudiante);
        return ResponseEntity.created(null).body(nuevoEstudiante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> update(@PathVariable int id, @RequestBody Estudiante estudiante) {
    	Estudiante estudianteActualizado = estudianteService.update(id, estudiante);
        if (estudianteActualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estudianteActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
    	estudianteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
 
}
