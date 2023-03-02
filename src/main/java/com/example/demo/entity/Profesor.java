package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6312584042883826099L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "correo")
    private String correo;

    @Column(name = "especialidad")
    private String especialidad;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_contrato")
    private Date fechaContrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
}

