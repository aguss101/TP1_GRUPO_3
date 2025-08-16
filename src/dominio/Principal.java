package dominio;

import java.time.LocalDate;

import dominio.Persona;

public class Principal {
	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setDni("11232444");
		p.setNombre("Jose");
		p.setApellido("Rodolfo");
		p.setFechaNacimiento(LocalDate.of(2002, 02, 02));
		p.setGenero("Masculino");
		p.setDireccion("Almirante 23");
		p.setTelefono("1134345656");
		p.setEmail("Rodolfo@gmail.com");
		
		Empleado e = new Empleado();
		Empleado e2 = new Empleado("22334455", "Ana", "Gomez", LocalDate.of(1990, 5, 12), "Femenino", "Calle 123", "1155555555", "ana@gmail.com", "Contadora");
		Empleado e3 = new Empleado("33445566", "Luis", "Perez", LocalDate.of(1985, 8, 23), "Masculino", "Av Siempreviva 742", "1166666666", "luis@gmail.com", "Gerente");
		
//		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		System.out.println("El proximo legajo sera el: " + Empleado.devuelveProximoLegajo());
	}
}
