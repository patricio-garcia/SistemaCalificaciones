package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
		Scanner reader = new Scanner(System.in);
		
		String materiaAlumno;
		Utilidad.showMessage("--------------------------------------------- Crear Alumno");
		Utilidad.showMessage("Ingresa RUT: ");
		String rutAlumno = reader.nextLine();
		Utilidad.showMessage("Ingresa nombre: ");
		String nombreAlumno = reader.nextLine();
		Utilidad.showMessage("Ingresa apellido: ");
		String apellidoAlumno = reader.nextLine();
		Utilidad.showMessage("Ingresa dirección: ");
		String direccionAlumno = reader.nextLine();
		Utilidad.showMessage("---------------------------------------------");
		return pasarAlumno(rutAlumno, nombreAlumno, apellidoAlumno, direccionAlumno);
	}
	
	public static Alumno pasarAlumno(String rutAlumno, String nombreAlumno, String apellidoAlumno, String direccionAlumno) {
		Alumno alumno = new Alumno(rutAlumno, nombreAlumno, apellidoAlumno, direccionAlumno);
		return alumno;
	}
}
