package dominio;

import dominio.Persona;
import java.time.LocalDate;

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
		
		
//		System.out.println(p.toString());
		System.out.println(e.toString());
	}
}
