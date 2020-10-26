package vistas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
				cargarDatos(filePath, fileName);
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
	
	public List<String> cargarDatos(String filePath, String fileName) {
		List<String> listaAlumnos = new ArrayList<String>();
		String file = filePath + fileName;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(new File(file));
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				transformarLinea(linea, listaAlumnos);
			}
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception error) {
				error.printStackTrace();
			}
		}
		System.out.println(listaAlumnos);
		return null;
	}
	
	private static void transformarLinea(String linea, List<String> listaAlumnos) {
		String[] tmp = linea.split(",");
		for (int i = 0; i < tmp.length; i++) {
			listaAlumnos.add(tmp[i]);
		}
		
	}
}
