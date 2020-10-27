package vistas;

import java.util.List;
import java.util.Scanner;
import modelos.Alumno;
import utilidades.Utilidad;

import servicios.AlumnoServicio;
import servicios.ArchivoServicio;

public class Menu extends MenuTemplate {
	AlumnoServicio alumnoServicio = new AlumnoServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	List<Alumno> listaAlumnos;
	String fileName = "notas.csv";
	Scanner reader = new Scanner(System.in);
	
	public void seleccionOpcion(List<String> pOpcionesMenu) {
		boolean continuar = false;
		int resultado;
		
		do {
			resultado = contruirMenu(pOpcionesMenu);
			
			switch (resultado) {
			case 1: 
				listaAlumnos.add(alumnoServicio.crearAlumno());
				System.out.println(listaAlumnos);
				Utilidad.stopAndContinue();
				break;
			case 2:
				alumnoServicio.listarAlumnos(listaAlumnos);
				break;
			case 3:
				System.out.println("opcion 3....");
				Utilidad.stopAndContinue();
				break;
			case 4:
				System.out.println("opcion 4....");
				Utilidad.stopAndContinue();
				break;
			case 5:
				listaAlumnos = archivoServicio.cargarDatos(fileName);
				if  (!listaAlumnos.isEmpty()) {
					Utilidad.showMessage("Datos cargados correctamente.");
					Utilidad.showMessage("---------------------------------------------");
					Utilidad.stopAndContinue();
				}
				break;
			case 6:
				archivoServicio.exportarDatos("promedio.txt", listaAlumnos);
				Utilidad.stopAndContinue();
				break;
			case 7:
				Utilidad.showMessage("Abandanonando el Sistema de Calificaciones...");
				Utilidad.stopAndContinue();
				Utilidad.showMessage("Ya ha salido del Sistema");
				continuar = true;
			}
		} while (!continuar);
	}
}
