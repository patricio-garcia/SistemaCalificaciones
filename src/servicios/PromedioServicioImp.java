package servicios;

import java.util.List;
import modelos.Alumno;
import utilidades.Utilidad;

public class PromedioServicioImp {
	public Double calcularPromedio(List<Alumno> listaAlumnos) {
		
		if (!listaAlumnos.isEmpty()) {
			return null;
		} else {
			Utilidad.showMessage("No se puede calcular el promedio, aún no carga datos");
		}
		return null;
		
	}
}
