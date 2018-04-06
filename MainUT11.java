
public class MainUT11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alumno01 = new Alumno("Joselito", 1981, "2º");
		Profesor profesor01 = new Profesor("Ana", 1977, 36000);

	
		
		System.out.println(alumno01.toString());
		System.out.println(profesor01.toString());
		
		double gasto = 100;
		
		System.out.println("El profesor "+profesor01.getNombre()+", tendrá un descuento de "+ (int)profesor01.calculaDescuento(gasto)+" euros en el gasto de "+(int)gasto +" euros");
		
		System.out.println("El alumno "+alumno01.getNombre()+", tendrá un descuento de "+ (int)alumno01.calculaDescuento(gasto)+" en el gasto de "+(int)gasto+" euros");
		
	}

}
