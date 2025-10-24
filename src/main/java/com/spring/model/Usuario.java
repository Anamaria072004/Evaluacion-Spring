package com.spring.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String email;
    private String password;
    private String telefono;
    private String fechaRegistro;

    @OneToMany(mappedBy = "usuario")
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	//To String
	

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password
				+ ", telefono=" + telefono + ", fechaRegistro=" + fechaRegistro + ", citas=" + citas + "]";
	}
	
	//Contructores using fields

	public Usuario(Integer id, String nombre, String email, String password, String telefono, String fechaRegistro,
			List<Cita> citas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.fechaRegistro = fechaRegistro;
		this.citas = citas;
	}

	//Construcrores Superclass
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}