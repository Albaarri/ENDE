package Ejercicio3_3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jlamo
 */
public class prestamo {
//La clase devolverá los datos de un préstamo hipotecario

    private String titularPrestamo;
    private double cantidad_solicitada;
    private double ingresos_mensuales;
    private double cantidad_ofertada;
    private double interes_prestamo;

    public prestamo() {
    }

    public prestamo(String titular_prestamo, double cantidad_solicitada, double ingresos_mensuales) {
        this.titularPrestamo = titular_prestamo;
        this.cantidad_solicitada = cantidad_solicitada;
        this.ingresos_mensuales = ingresos_mensuales;
    }

    public String getTitularPrestamo() {
        return titularPrestamo;
    }

    public void setTitularPrestamo(String titular_prestamo) {
        this.titularPrestamo = titular_prestamo;
    }

    public double getCantidad_solicitada() {
        return cantidad_solicitada;
    }

    public void setCantidad_solicitada(double cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public double getIngresos_mensuales() {
        return ingresos_mensuales;
    }

    public void setIngresos_mensuales(double ingresos_mensuales) {
        this.ingresos_mensuales = ingresos_mensuales;
    }

    public double getCantidad_ofertada() {
        return cantidad_ofertada;
    }

    public void setCantidad_ofertada(double cantidad_ofertada) {
        this.cantidad_ofertada = cantidad_ofertada;
    }

    public double getInteres() {
        return interes_prestamo;
    }

    public void setInteres(double interes_prestamo) {
        this.interes_prestamo = interes_prestamo;
    }

    //Este método calculará la cantidad ofertada por la entidad para el préstamo solicitado
    public double calcular_cantidad_solicitada(double cantidad_solicitada, double ingresos) {
    														//NODOS
        double cantidad_calculada = 0;						//		1

        if (ingresos <= 0) {								//		2
            cantidad_calculada = 0;							//		3
        } else if (ingresos > 0 && ingresos <= 900) {		//		4
            if (cantidad_solicitada > 3000) {				//		5
                cantidad_calculada = 3000;					//		6
            } else {
                cantidad_calculada = cantidad_solicitada;	//		7
            }
        } else if (ingresos > 900 && ingresos < 1500) {		//		8	
            if (cantidad_solicitada > 9000) {				//		9
                cantidad_calculada = 9000;					//		10
            } else {
                cantidad_calculada = cantidad_solicitada;	//		11
            }
        } else if (ingresos >= 1500) {						//		12
            if (cantidad_solicitada > 15000) {				//		13
                cantidad_calculada = 15000;					//		14
            } else {
                cantidad_calculada = cantidad_solicitada;	//		15
            }
        }
        return cantidad_calculada;							//		16
    }

    //Este método calculará el interés asociado al préstamo
    public double calcular_interes_prestamo(double cantidad_solicitada) {
    														//NODOS
        double interes_calculado = 0;						//		1
        double cantidad_intermedia = cantidad_solicitada;	//		1
        //int ciclos = ((int) (cantidad_solicitada)) + 1;	//
        do {												//
            interes_calculado += 1.5;						//		2
            cantidad_intermedia -= 1000;					//		2
        } while (cantidad_intermedia >= 0);					//		3
        return interes_calculado;							//		4
    }

}
