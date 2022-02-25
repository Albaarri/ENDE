package Ejercicio3_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class consumoTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	  
	  
	 /* 
	 false,158.0,7 31.7422
	 false,300.0,15 55.71750000000001
	 false,250.0,10 46.43125
*/
	
	@ParameterizedTest
	@CsvSource({"false,2.1,5,0.529935","true,2.1,5,0.0","false,158.0,2,32.39"})
	@DisplayName("Prueba consumo factura")
	void testSalarioNeto (boolean b, double c, int a, double resul) {
		assertEquals(resul,factura.calcularFactura(b, c, a));
	}
}
