package Ejercicio3_2;

import java.util.Scanner;

class factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idAbonado;
		boolean bono;
		double consumo;
		int antig;
		double totFact;
		
		Scanner sc = new Scanner(System.in);
       
		System.out.println("Intoduce si tienes bono(si/no): ");
		String bon = sc.next();
		
		System.out.println("Intoduce el consumo: ");
		consumo = sc.nextBigInteger().doubleValue();
		
		System.out.println("Intoduce la antigüedad: ");
		antig = sc.nextInt();
        
		if (bon.equals("si"))
			bono = true;
		else bono = false;
			
		
		totFact = calcularFactura(bono, consumo, antig);
		
		System.out.println("La factura es: "+ totFact);
		
		sc.close();

	}

	public static double calcularFactura(boolean b, double c, int a) {
		double total = 0;
		if (!b) {
			if (c < 100) 
				total = c * 0.2575;
			else 
				if (c < 250) 
					total = c * 0.2050;
				else total = c * 0.1955;
			
			if (a > 10)
				total = total * 0.95; //total *= 0.95;
			else
				if (a > 5)
					total = total * 0.98;
		}
		return total;
	}
}
