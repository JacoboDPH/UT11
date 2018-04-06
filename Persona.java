
public class Persona {

	 private String nombre;
	 private int anyoNacimiento;

	 public Persona(String nombre, int anyoNacimient) {
		
		 this.nombre = nombre;
		 this.anyoNacimiento = anyoNacimient;
	}
	 
	 public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	 
}
