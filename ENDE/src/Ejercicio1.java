import java.util.Random;

/**
 * @author Fernando del Fresno García
 * 
 *         Ejemplo para depurar. Este ejercicio debe:
 *         - Rellenar un array con 10 números 
 *         - Los números deben ir del 1 al 100 
 *         - Encontrar el máximo y mínimo de los números generados 
 *         
 *         Ejercicio: 
 *         - Encontrar posibles errores en el código. 
 *         - Ayuda: Existen 3 errores
 *         - Ayuda: Entiende el programa antes de ponerte a depurar
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		//generamos un array aleatorio con numeros
		int[] arrNumeros = generarNumeros();
		// imprime los números sorteados
		print2Console("Números sorteados: ", arrNumeros);
		//imprime el máximo
		System.out.println("Máximo:" + max(arrNumeros));
		// imprime el mínimo
		System.out.println("Mínimo:" + min(arrNumeros));
	}

	/**
	 * Genera aleatoriamente diez números
	 * 
	 * @return Los números generados
	 */
	private static int[] generarNumeros() {
		Random random = new Random();
		int[] arrNumeros = new int[10];
		// sortea 10 números del 0 al 99
		for (int i = 0; i < arrNumeros.length - 2; i++) {
			arrNumeros[i] = random.nextInt(100) * 2;
		}
		return arrNumeros;
	}

	/**
	 * Imprime por la consola el texto message seguido de los números del array
	 * arrNumeros separados por espacios
	 * 
	 * @param message
	 *            El mensaje a ser mostrado
	 * @param arrNumeros
	 *            Los números a ser impresos
	 */
	private static void print2Console(String message, int[] arrNumeros) {
		System.out.print(message);
		for (int number : arrNumeros) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	/**
	 * retorna el máximo de los números
	 * 
	 * @param arrNumeros
	 *            Los números donde buscar el máximo
	 * @return El número máximo
	 */
	private static int max(int[] arrNumeros) {
		int max = 0;
		for (int number : arrNumeros) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}

	/**
	 * retorna el mínimo de los números
	 * 
	 * @param arrNumeros
	 *            Los números dónde buscar el mínimo
	 * @return El número mínimo
	 */
	private static int min(int[] arrNumeros) {
		int min = arrNumeros[0];
		for (int number : arrNumeros) {
			return number;
		}
		return min;
	}

}