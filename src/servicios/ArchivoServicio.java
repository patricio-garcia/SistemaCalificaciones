package servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import modelos.Alumno;
import utilidades.Utilidad;

public class ArchivoServicio {
	Scanner reader = new Scanner(System.in);
	
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
	
	public void exportarDatos(String fileName, List<Alumno> listaAlumnos) {
		Utilidad.showMessage("--------------------------------------------- ExportarDatos");
		Utilidad.showMessage("Ingresa la ruta en donde se encuentra el archivo notas.csv :");
		String filePath = reader.nextLine();
		String file = filePath + "/" + fileName;
		File fl  = new File(file);
		if (fl.exists()) {
			fl.delete();
		}
		
		try {
			PrintWriter pWriter = new PrintWriter(new FileWriter(file));
			listaAlumnos.forEach(value -> pWriter.println(value));
			pWriter.close();
			Utilidad.showMessage("Datos exportados correctamente.");
		}
		catch (IOException error){
			Utilidad.showMessage("El archivo no pudo ser creado");
		} finally {
			Utilidad.showMessage("---------------------------------------------");
		}
		
	}

}
