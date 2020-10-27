package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import servicios.AlumnoServicio;
import modelos.Alumno;

public class AlumnoTest {
	
	private AlumnoServicio alumnoServicio;
	private Alumno alumno;
	
	@BeforeEach
	void Setup() {
		alumnoServicio = new AlumnoServicio();
		alumno = new Alumno();
	}
	
	@Test
	void crearAlumnoTest() {
		// Given
		String rut = "12.268.693-0";
		String nombre = "Pato";
		String materia = "LENGUAJE";
		Double nota = 4.0;

		// When
		alumno = alumnoServicio.pasarAlumno(rut, nombre, materia, nota);
		String a = alumno.getNombreAlumno();
		System.out.println(a);
		
		
		// Then
		assertEquals(a, "Pato");
	}

}
