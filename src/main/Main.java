package main;

import vistas.MenuTemplate;
import java.util.Scanner;
import modelo.MateriaEnum;

public class Main {
	
	//public static final int MATEMATICAS = 1;

	public static void main(String[] args) {
		
		MenuTemplate menu= new MenuTemplate();
		menu.iniciarMenu();
		
		/*
		MateriaEnum asignatura = MateriaEnum.MATEMATICAS;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Ingrese tipo materia");
		int respuesta = reader.nextInt();
		MateriaEnum[] valor = MateriaEnum.values();
		
		for (int i = 0; i < valor.length; i++) {
			if (respuesta == valor[i].ordinal()) {
				System.out.println("Son iguales");
			}
		}
		
		//MateriaEnum valor = MateriaEnum.valueOf(respuesta);
		//System.out.println(valor);
		 * 
		 */
	}

}
