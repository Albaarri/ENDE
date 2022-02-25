import javax.swing.JOptionPane;

public class Debug02_Explicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos del array"));
		//Creamos un array con el numero de elementos introducido
		int num_aleatorios[] = new int[elementos];
		
		//Llenamos el array con numeros aleatorios
		for (int i=0; i < num_aleatorios.length; i++) {
			num_aleatorios[i] = (int)(Math.random()*100);
		} //fin for
		imprimeArray(num_aleatorios);
	}
	
	//funcion para imprimir los valores del array
	public static void imprimeArray(int[] arrValores) {
		for (int i=0; i < arrValores.length; i++) {
			System.out.print(arrValores[i] + " ");
		} //fin for
	}

}
