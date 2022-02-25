package Ejercicio3_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName; //Importamos para el @DisplayName
import org.junit.jupiter.params.ParameterizedTest;//Importamos para lo del CSV
import org.junit.jupiter.params.provider.CsvSource;


class testEjericio3_1_Salario {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	//Caso de prueba del Salario Bruto
	@DisplayName("Prueba del Salario Bruto") //El DisplayName es opcional
	void testSalarioBruto() {
		
	}
	
	@DisplayName("Prueba del Salario Neto")	//El DisplayName es opcional
	//Caso de prueba del Salario Neto
	void testSalarioNeto() {
		assertEquals(1640, Ejercicio3_1_Salario.calculaSalarioNeto(2000));
		//Si no fuera static la clase de Salario habría que crear un objeto aquí y llamarlo aquí:
			//Ejercicio3_1_Salario salario_01=new Ejercicio3_1_Salario();
			//assertEquals(1640, salario_01.calculaSalarioNeto(2000));
		assertEquals(1230, Ejercicio3_1_Salario.calculaSalarioNeto(1500));			
		
	}// Al ejecutar esta prueba vemos si nos ha dado algún fallo o no.
	
	
	
	//Con CSV
		//También podemos pasar los datos de entrada y de salida esperada por un CSV para pasar varias pruebas a la vez:
		@ParameterizedTest
		@CsvSource({"2000,1640","1500,1230","1000,840"})
		@DisplayName("Prueba del Salario Neto")	//El DisplayName es opcional
		//Caso de prueba del Salario Neto
		void testSalarioNeto_CSV(double brut, double resul) {
			assertEquals(1640, Ejercicio3_1_Salario.calculaSalarioNeto(2000));
			//Si no fuera static la clase de Salario habría que crear un objeto aquí y llamarlo aquí:
				//Ejercicio3_1_Salario salario_01=new Ejercicio3_1_Salario();
				//assertEquals(1640, salario_01.calculaSalarioNeto(2000));
			assertEquals(resul, Ejercicio3_1_Salario.calculaSalarioNeto(brut));			
			
		}//Los resultados aparecen a la izq si están bien o no y a eso es a lo que se le hace pantallazo
	
}
