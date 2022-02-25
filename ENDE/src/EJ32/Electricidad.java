package EJ32;

import java.util.Scanner;

public class Electricidad {
	
	String idAbonado;
	boolean bono;
	double consumo;
	int antig;
	double totalF;
	
	public String getIdAbonado() {
		return idAbonado;
	}

	public void setIdAbonado(String idAbonado) {
		this.idAbonado = idAbonado;
	}

	public boolean isBono() {
		return bono;
	}

	public void setBono(boolean bono) {
		this.bono = bono;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public int getAntig() {
		return antig;
	}

	public void setAntig(int antig) {
		this.antig = antig;
	}

	public double getTotalF() {
		return totalF;
	}

	public void setTotalF(double totalF) {
		this.totalF = totalF;
	}

	
	
	public static void main(String[] args) {
		cliente cli=new cliente();
		double con,factura =0;
		int antig;
		String bono;
		boolean b;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Introduce el consumo: ");
		con=sc.nextDouble();
		System.out.println("Introduce la antigüedad: ");
		antig=sc.nextInt();
		System.out.println("¿Tienes bono?");
		bono=sc.next();
		
		if(bono.equals("si"))
			b=true;
		else
			b=false;
		
		factura=carcularFactura(con, antig, b);
		
		sc.close();
	}
	
	public static double carcularFactura (double consum, int ant, boolean bon) {
		double total_fact=0;
		
		if(!bon) {
			if(consum<100)
				total_fact=consum*0.2575;
			else
				if(consum<250)
					total_fact=consum*0.2050;
				else
					total_fact=consum*0.1955;
			
			if(ant>10) 
				total_fact*=0.95;
				else
					if(ant>5)
						total_fact*=0.98;
			
		}
		
		return total_fact;
	}
	
}
