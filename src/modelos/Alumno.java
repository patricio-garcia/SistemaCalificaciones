package modelos;

public class Alumno {
	private String rutAlumno;
	private String nombreAlumno;
	private String materiaAlumno;
	private Double notaAlumno;

	public Alumno() {
	}

	public Alumno(String rut, String nombre, String materia, Double nota) {
		this.rutAlumno = rut;
		this.nombreAlumno = nombre;
		this.materiaAlumno = materia;
		this.notaAlumno = nota;
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

	public String getmateriaAlumno() {
		return materiaAlumno;
	}

	public void setmateriaAlumno(String materia) {
		this.materiaAlumno = materia;
	}

	public Double getnotaAlumno() {
		return notaAlumno;
	}

	public void setnotaAlumno(Double nota) {
		this.notaAlumno = nota;
	}

	@Override
	public String toString() {
		return "Alumno [rutAlumno=" + rutAlumno + ", nombreAlumno=" + nombreAlumno + ", materiaAlumno=" + materiaAlumno
				+ ", notaAlumno=" + notaAlumno + "]";
	}
}
