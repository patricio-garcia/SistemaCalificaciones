package servicios;

import java.util.List;

import modelos.Alumno;

public class AlumnoServicio {
	private List<Alumno> listaAlumnos;

	public void listarAlumnos(List<Alumno> listaAlumnos) {
		for (Alumno alumno : listaAlumnos) {
			String notaAlummno = alumno.getnotaAlumno().toString();
			System.out.println("");
			System.out.println("Alumno: " + alumno.getRutAlumno() + " - " + alumno.getNombreAlumno());
			System.out.print("Maetia: " + alumno.getmateriaAlumno() + " - " );
			System.out.println(notaAlummno);

		}
	}
}
