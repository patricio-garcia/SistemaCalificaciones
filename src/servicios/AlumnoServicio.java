package servicios;

import java.util.List;
import java.util.Scanner;

import modelos.Alumno;
import utilidades.Utilidad;

public class AlumnoServicio {
	public void listarAlumnos(List<Alumno> listaAlumnos) {
		Utilidad.showMessage("--------------------------------------------- Listar Alumnos");
		if (!listaAlumnos.isEmpty()) {
			for (Alumno alumno : listaAlumnos) {
				Utilidad.showMessage("");
				Utilidad.showMessage("Datos Alumno:");
				Utilidad.showMessage("RUT: " + alumno.getRutAlumno());
				Utilidad.showMessage("Nombre: " + alumno.getNombreAlumno());
				Utilidad.showMessage("Materia: " + alumno.getmateriaAlumno());
				String notaAlummno = alumno.getnotaAlumno().toString();
				Utilidad.showMessage("Nota: " + notaAlummno);
			}
			Utilidad.showMessage("---------------------------------------------");
			
		} else {
			Utilidad.showMessage("No se puede listar los Alumnos, aún no carga datos");
		}
		Utilidad.stopAndContinue();
	}
	
	public Alumno crearAlumno() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		Utilidad.showMessage("--------------------------------------------- Crear Alumno");
		Utilidad.showMessage("Ingresa RUT: ");
		String rutAlumno = reader.nextLine();
		Utilidad.showMessage("Ingresa nombre: ");
		String nombreAlumno = reader.nextLine();
		Utilidad.showMessage("Ingresa materia: ");
		String materiaAlumno1 = reader.nextLine();
		Utilidad.showMessage("Ingresa nota: ");
		Double notaAlumno = reader.nextDouble();
		Utilidad.showMessage("---------------------------------------------");
		return pasarAlumno(rutAlumno, nombreAlumno, materiaAlumno1, notaAlumno);
	}
	
	public Alumno pasarAlumno(String rutAlumno, String nombreAlumno, String materiaAlumno, Double notaAlumno) {
		Alumno alumno = new Alumno(rutAlumno, nombreAlumno, materiaAlumno, notaAlumno);
		return alumno;
	}
}
