package dominio;
import java.time.LocalDate;

import dominio.Persona;

public class Empleado extends Persona {
	private int legajo = 1000;
	private String puesto;
	private static int cont = 0;
	
	public Empleado() {
		super();
		cont++;
		this.puesto = "Sin puesto";
		this.legajo = cont;
		
	}
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email,  String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		cont++;
		this.puesto = puesto;
		this.legajo = cont;
		
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
