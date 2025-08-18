package dominio;
import java.time.LocalDate;

import dominio.Persona;

public class Empleado extends Persona {
	private final int legajo;
	private String puesto;
	private static int cont = 1000;
	
	public Empleado() {
		super();
		this.puesto = "Sin puesto";
		this.legajo = cont++;
	}
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email,  String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		this.legajo = cont++;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + 
				"Empleado\n    " +
				"Legajo= " + legajo + "\n    " + 
				"Puesto=" + puesto;
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
	public static int devuelveProximoLegajo() {
		return Empleado.cont++;
	}
	

}
