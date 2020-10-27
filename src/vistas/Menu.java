package vistas;

import java.util.ArrayList;
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
	
	public void iniciarMenu() {
		List<String> opcionesMenu = new ArrayList<String>();
		opcionesMenu.add("Crear Alumnos");// 0
		opcionesMenu.add("Listar Alumnos");// 1
		opcionesMenu.add("Agregar Materias");// 2
		opcionesMenu.add("Agregar Notas");// 3
		opcionesMenu.add("Cargar Datos");// 4
		opcionesMenu.add("Exportar Datos");// 5
		opcionesMenu.add("Salir");// 6
		Menu menu = new Menu();
		menu.seleccionOpcion(opcionesMenu);
	}
	
	protected int contruirMenu(List<String> pOpcionesMenu) {
		List<String> opcionesMenu = pOpcionesMenu;
		int largo = opcionesMenu.size();
		
		for (int i = 0; i < largo; i++) {
			System.out.println(i+1 + " " + opcionesMenu.get(i));
		}
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int opcion = 0;
		Utilidad.showMessage("Ingrese una opción: ");;
		try {
			opcion =  reader.nextInt();	
		} catch (Exception error) {
			reader.nextLine();
		}
		if (opcion < 1 || opcion >= largo+1) {
			Utilidad.showMessage("--------------------------------------------- Selección no permitida");
		} else {
			return opcion;
		}
		return 0;
	}
	
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
