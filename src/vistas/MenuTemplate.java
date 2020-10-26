package vistas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilidades.Utilidad;

public class MenuTemplate {
	
	public static void iniciarMenu() {
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
		return seleccionValida(largo);
	}
	
	private int seleccionValida(int largo) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int opcion = 0;
		boolean valida = false;
		while(!valida) {
			Utilidad.showMessage("Ingrese una opción: ");;
			try {
				opcion =  reader.nextInt();	
			} catch (Exception error) {
				reader.nextLine();
			}
			
			if (opcion < 1 || opcion >= largo+1) {
				Utilidad.showMessage("Opción inválida, intente de nuevo");
			} else {
				valida = true;
			}
		}
		return opcion;
	}
	
}
