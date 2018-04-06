
public class Profesor extends Persona implements calculaDescuento {

	private int salario;
	
	public Profesor(String nombre, int anyoNacimient,int salario) {
		super(nombre, anyoNacimient);
		
		this.salario = salario;
		
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String toString() {
		
		return "El nombre del profesor/a es " + super.getNombre()+ " que ha nacido en el año "+super.getAnyoNacimiento()
		+" y tiene un salario de "+salario;
	}


	public double calculaDescuento(double d) {
		// TODO Auto-generated method stub
		return d*0.02;
	}
}
