package dominio;
import java.time.LocalDate;

import dominio.Persona;

public class Empleado extends Persona {
	private int legajo;
	private String puesto;
	
	
	public Empleado() {
		super();
		this.puesto = "Sin puesto";
		
	}
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email,  String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		
	}
	
	@Override
	public String toString() {
		return "Empleado Legajo=" + legajo + ", Puesto=" + puesto;
	}
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
