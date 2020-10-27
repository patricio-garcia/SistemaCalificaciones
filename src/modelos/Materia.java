package modelos;

import java.util.List;

public class Materia {
	private MateriaEnum nombreMateria;
	List<Double> notasAlumno;
	
	public Materia() {}
	
	public Materia(MateriaEnum nombreMateria, List<Double> notasAlumno) {
		this.nombreMateria = nombreMateria;
		this.notasAlumno = notasAlumno;
	}

	public MateriaEnum getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(MateriaEnum nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public List<Double> getNotasAlumno() {
		return notasAlumno;
	}

	public void setNotasAlumno(List<Double> notasAlumno) {
		this.notasAlumno = notasAlumno;
	}
	
	
}
