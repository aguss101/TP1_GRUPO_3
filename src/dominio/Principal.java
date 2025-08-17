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
		Empleado e4 = new Empleado("77889911", "Marcelo", "Almeida", LocalDate.of(1987, 1, 28), "Masculino", "Asereje 12", "1165844478", "malmeida@gmail.com", "Repositor");
		Empleado e5 = new Empleado("88991122", "Jonathan", "Joestar", LocalDate.of(1868, 4, 4), "Masculino", "Avey Road", "33587455", "jojo_one@gmail.com", "Ejecutivo de Ventas");
		
//		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		
		System.out.println("El proximo legajo sera el: " + Empleado.devuelveProximoLegajo());
	}
}
