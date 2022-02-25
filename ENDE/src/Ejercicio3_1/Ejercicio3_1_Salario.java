package Ejercicio3_1;

import java.util.Scanner;
import java.io.*;

public class Ejercicio3_1_Salario {

	public static void main(String[] args) throws IOException {
		double salBrut;
		double salNeto;
		double ventasMes;
		int horasExtra;
		String tipoEmpleado;
		
		Scanner sc = new Scanner(System.in);
       
		System.out.println("Intoduce las ventas al mes: ");
		ventasMes = sc.nextDouble();
		
		System.out.println("Intoduce las horas extra: ");
		horasExtra = sc.nextInt();
		
		System.out.println("Intoduce el tipo de empleado: (vendedor o encargado) ");
		tipoEmpleado = sc.next();
        
		salBrut = calculaSalarioBruto(tipoEmpleado, ventasMes, horasExtra);
		salNeto = calculaSalarioNeto(salBrut);
		
		System.out.println("El salario bruto es: "+ salBrut);
		System.out.println("El salario neto es: "+ salNeto);
		
		sc.close();

	}
	
	
	public static double calculaSalarioNeto (double salbr) {
		double salnet;
		
		if (salbr > 1500)
			salnet = salbr*0.82;
		else
			if (salbr >= 1000)
				salnet = salbr*0.84;
			else
				salnet = salbr;
		
		return salnet;
	}
	
	public static double calculaSalarioBruto (String tipo, double ventasMes, int horasExtr) {
		double salbr=0;
		
		if (tipo.equals("vendedor"))
				salbr += 1000;
		else
				salbr += 1500;
		
		if (ventasMes >= 1500)
				salbr += 200;
		else
			if (ventasMes > 1000)
				salbr += 100;
		salbr += horasExtr*20;
		
		return salbr;
	}
}