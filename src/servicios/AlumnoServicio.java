package servicios;

import java.util.List;

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
}
