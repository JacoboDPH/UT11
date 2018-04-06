
public class Alumno extends Persona implements calculaDescuento {

	private String curso;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Alumno(String nombre, int anyoNacimient,String curso) {
		super(nombre, anyoNacimient);
		
		this.curso = curso;
			
	}
	
	public String toString() {
		return "El nombre del alumno/a es "+ super.getNombre()+ " y esta cursando "+ getCurso() + " que ha nacido en el año "+super.getAnyoNacimiento();
	}


	public double calculaDescuento(double d) {
		
		return d*0.10;
	}
	

}
