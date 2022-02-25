package Ejercicio3_3;

public class mainPrestamo { //Esta es la clase para probar los métodos de prestamo.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prestamo pres1=new prestamo("Miguel",5000,1300);
		
		double cantidadDada = pres1.calcular_cantidad_solicitada(5000, 1300);
		double intereses = pres1.calcular_interes_prestamo(cantidadDada);
		
		System.out.println("La cantidad dada es: "+cantidadDada);
		System.out.println("Los intereses son: "+intereses+" %");
	}

}
