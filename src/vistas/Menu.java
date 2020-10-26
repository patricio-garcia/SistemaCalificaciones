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
				System.out.println("opcion 4....");
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
	
}
