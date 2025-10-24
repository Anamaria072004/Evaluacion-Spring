package com.spring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private String duracion;
    private Double precio;

    @OneToMany(mappedBy = "servicio")
    private List<Cita> citas;

    // Getters y setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}


	  //to String 
		
	@Override
	public String toString() {
		return "Servicio [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", duracion=" + duracion
				+ ", precio=" + precio + ", citas=" + citas + "]";
	}

	//using fields
	public Servicio(Integer id, String nombre, String descripcion, String duracion, Double precio, List<Cita> citas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.precio = precio;
		this.citas = citas;
	}

    //From Superclass
	
	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}


	
    
    
	
	
}