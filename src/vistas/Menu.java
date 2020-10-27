package vistas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import modelo.Alumno;
import utilidades.Utilidad;

import servicios.AlumnoServicio;
import servicios.ArchivoServicio;

public class Menu extends MenuTemplate {
	AlumnoServicio alumnoServicio = new AlumnoServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	String filePath = "C:\\Users\\Patricio\\eclipse-workspace\\SistemaCalificaciones\\src\\input\\";
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
				Utilidad.cleanScreen();
				break;
			case 2:
				System.out.println("opcion 2....");
				Utilidad.cleanScreen();
				break;
			case 3:
				System.out.println("opcion 3....");
				Utilidad.cleanScreen();
				break;
			case 4:
				List<Alumno> listaAlumnos = cargarDatos(filePath, fileName);
				System.out.println(listaAlumnos);
				Utilidad.cleanScreen();
				break;
			case 5:
				System.out.println("opcion 5....");
				Utilidad.cleanScreen();
				break;
			case 6:
				System.out.println("opcion 6....");
				Utilidad.cleanScreen();
				break;
			case 7:
				Utilidad.cleanScreen();
				Utilidad.showMessage("Abandanonando el Sistema de Calificaciones...");
				continuar = true;
			}
		} while (!continuar);
	}
	
	public List<Alumno> cargarDatos(String filePath, String fileName) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		String file = filePath + fileName;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(new File(file));
			br = new BufferedReader(fr);
			return br.lines().map(line -> line.split(",")).map(values -> new Alumno(values[0], values[1], values[2], 
					Double.parseDouble(values[3]))).collect(Collectors.toList());
		} catch (Exception e) {
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
	
	/*private static void transformarLinea(String linea, List<Alumno> listaAlumnos) {
		String[] tmp = linea.split(",");
		for (int i = 0; i < tmp.length; i++) {
			listaAlumnos.add(tmp[i]);
		}
		
	}*/
}
