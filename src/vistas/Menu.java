package vistas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
				System.out.println("opcion 1....");
				Utilidad.stopAndContinue();
				break;
			case 2:
				AlumnoServicio listar = new AlumnoServicio();
				listar.listarAlumnos(listaAlumnos);
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
				listaAlumnos = cargarDatos(fileName);
				if  (!listaAlumnos.isEmpty()) {
					Utilidad.showMessage("Datos cargados correctamente.");
					Utilidad.showMessage("---------------------------------------------");
					Utilidad.stopAndContinue();
				}
				break;
			case 6:
				System.out.println("opcion 6....");
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
	
	public List<Alumno> cargarDatos(String fileName) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Utilidad.showMessage("--------------------------------------------- Cargar Datos");
		Utilidad.showMessage("Ingresa la ruta en donde se encuentra el archivo notas.csv :");
		String filePath = reader.nextLine();
		String file = filePath + "/" + fileName;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(new File(file));
			br = new BufferedReader(fr);
			return br.lines().map(line -> line.split(",")).map(values -> new Alumno(values[0], values[1], values[2], 
					Double.parseDouble(values[3]))).collect(Collectors.toList());
		} catch (Exception error) {
				Utilidad.showMessage("No se pudo cargar el archivo");
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception error) {
				Utilidad.showMessage("No se pudo cerrar el archivo");;
			}
		}
		return null;
	}
}
