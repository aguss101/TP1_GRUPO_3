package dominio;

import java.time.LocalDate;

public class Persona {
	private String dni,nombre, apellido, genero, direccion, telefono, email;
	private LocalDate fechaNacimiento;
	private int edad;
	
	  
	//Constructores
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public Persona() { 
	
		this.nombre = "sin nombre";
		this.edad = 99;
		}

	public String getDni() {return dni;}
	public String getNombre() { return nombre; }
	public String getApellido() { return apellido; }
	public LocalDate getFechaNacimiento() { return fechaNacimiento; }
	public String getGenero() { return genero; }
	public String getDireccion() { return direccion; }
	public String getTelefono() { return telefono; }
	public String getEmail() { return email; }	
	
	public void setDni(String dni) {this.dni = dni;}
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setApellido(String apellido) { this.apellido = apellido;}
	public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
	public void setGenero(String genero) { this.genero = genero; }
	public void setDireccion(String direccion) { this.direccion = direccion; }
	public void setTelefono(String telefono) { this.telefono = telefono; }
	public void setEmail(String email) { this.email = email; }

	@Override
	public String toString() {
		return "Persona dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email  ;
	}
}
