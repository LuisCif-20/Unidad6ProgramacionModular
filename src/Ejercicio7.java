package src;
import java.util.*;
public class Ejercicio7{
	public static void main(String[] args) {
		Ejercicio7 e7 = new Ejercicio7("Estamos en Ejercicio7");
	}

	int [][] matriz = new int[4][3];
	Random ale = new Random();

	public Ejercicio7(String mensaje){
		System.out.println(mensaje);
		llenarMatriz();
		System.out.println("La matriz es: ");
		imprimirMatriz();
		System.out.println("La suma de las filas pares es: " + sumarNumeros());
	}
	public void llenarMatriz(){
		for ( int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
				matriz[i][j] = ale.nextInt(556);
			}
		}
	}
	public int sumarNumeros(){
		int total = 0;
		for (int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
				int par = i%2;
				if (par != 0) {
					total += matriz[i][j];
				}
			}
		}
		return total;
	}
	public void imprimirMatriz(){
		for ( int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println(" ");
		}
	}
}