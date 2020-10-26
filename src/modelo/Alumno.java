package modelo;

import java.util.List;

public class Alumno {
	private String rutAlumno;
	private String nombreAlumno;
	private String apellidoAlumno;
	private String direccionAlumno;
	private List<String> listaMaterias;
	
	public Alumno() {}
	
	public Alumno(String rut, String nombre, String apellido, String direccion, List<String> listaMaterias) {
		this.rutAlumno = rut;
		this.nombreAlumno = nombre;
		this.apellidoAlumno = apellido;
		this.direccionAlumno = direccion;
		this.listaMaterias = listaMaterias;
	}

	public String getRutAlumno() {
		return rutAlumno;
	}

	public void setRutAlumno(String rutAlumno) {
		this.rutAlumno = rutAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public String getDireccionAlumno() {
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}

	public List<String> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(List<String> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}
	
}
