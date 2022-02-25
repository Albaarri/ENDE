package ordenaArray;

import java.util.*;

public class ordenaArray {
	
	public static void main(String[] args) {
			int arrayNums[] = {45,6,48,72,3};
			int nume;
			boolean res;
			Scanner sc = new Scanner (System.in);

			System.out.println("El array antes de ser ordenado es: ");
			mostrarDatosArray(arrayNums);
			ordenarArray(arrayNums);
			System.out.println("El array ordenado es: ");
			mostrarDatosArray(arrayNums);
			System.out.println("Introduce un n�mero para comprobar que est� contenido en el array: ");
			nume = Integer.parseInt(sc.nextLine());
			res = contieneNum(arrayNums,nume);
			if (res) System.out.println("Has introducido un n�mero que est� contenido en el array.");
			else System.out.println("Has introducido un n�mero que no est� contenido en el array.");
		}
		
		static void llenarDatosArray (int[] arNum) {
			Scanner inScanner = new Scanner (System.in);
			for (int i=0;i<arNum.length;i++) {
				arNum[i] = Integer.parseInt(inScanner.nextLine());	
			}
			inScanner.close();
		}
		
		static void mostrarDatosArray (int arNum[]) {
			for (int i=0;i<arNum.length;i++) {
				if (i==(arNum.length-1))
					System.out.print(arNum[i]);
				else System.out.print(arNum[i]+" -- ");
			}
			System.out.println();
		}
		
		static boolean contieneNum (int arNum[], int n) {
			boolean esta = false;
			int i=0;
			
			do {
				if (arNum[i]==n)
					esta = true;
				else i++;
			} while ((!esta) && (i<arNum.length));
			
			return esta;
		}
		
		static void ordenarArray (int arNum[]) {
			int aux;
			for (int j=0; j<arNum.length;j++) {
				for (int i=0;i<arNum.length;i++) {
					if ((i<(arNum.length-1)) && (arNum[i] > arNum[i+1])) {
						aux=arNum[i];
						arNum[i]=arNum[i+1];
						arNum[i+1]=aux;
					} 
				}
			}	
		}
		
		static int[] ordenarArray2 (int arNum[]) {
			int aux;
			for (int j=0; j<arNum.length;j++) {
				for (int i=0;i<arNum.length;i++) {
					if ((i<(arNum.length-1)) && (arNum[i] > arNum[i+1])) {
						aux=arNum[i];
						arNum[i]=arNum[i+1];
						arNum[i+1]=aux;
					} 
				}
			}	
			
			return arNum;
		}
}
