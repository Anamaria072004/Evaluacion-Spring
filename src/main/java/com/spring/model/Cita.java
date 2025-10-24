package com.spring.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime fechahora;
    private String estado; // pendiente, completada, cancelada

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "profesional_id")
    private Profesional profesional;

 // Getters y setters
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechahora() {
		return fechahora;
	}

	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}
	
	//To String
	@Override
	public String toString() {
		return "Cita [id=" + id + ", fechahora=" + fechahora + ", estado=" + estado + ", usuario=" + usuario
				+ ", servicio=" + servicio + ", profesional=" + profesional + "]";
	}

	//Using Fileds
	public Cita(Integer id, LocalDateTime fechahora, String estado, Usuario usuario, Servicio servicio,
			Profesional profesional) {
		super();
		this.id = id;
		this.fechahora = fechahora;
		this.estado = estado;
		this.usuario = usuario;
		this.servicio = servicio;
		this.profesional = profesional;
	}

	//Superclass
	
	public Cita() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
    
}