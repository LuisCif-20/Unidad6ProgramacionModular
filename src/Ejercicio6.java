package src;
import java.util.*;
public class Ejercicio6{
	public static void main(String[] args) {
		Ejercicio6 e6 = new Ejercicio6("Estamos en Ejercicio6");
	}

	int[][] matriz = new int[3][3];

	public Ejercicio6(String mensaje){
		System.out.println(mensaje);
		llenarMatriz();
		System.out.println("El doble de la matriz: ");
		System.out.println("");
		imprimirMatriz();
		System.out.println("");
		System.out.println("Es: ");
		System.out.println("");
		multiplicarPorDos();
		imprimirMatriz();

	}
	public void llenarMatriz(){
		matriz[0][0] = 5;
		matriz[0][1] = 6;
		matriz[0][2] = 13;
		matriz[1][0] = 14;
		matriz[1][1] = 2;
		matriz[1][2] = 4;
		matriz[2][0] = 21;
		matriz[2][1] = 7;
		matriz[2][2] = 6;
	}
	public void multiplicarPorDos(){
		for (int i = 0; i < 3 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
				matriz[i][j] *= 2;
			}
		}
	}
	public void imprimirMatriz(){
		int i = 0;
		int j = 0;
		for ( i = 0; i < 3 ; i++ ) {
			for ( j = 0; j < 3 ; j++ ) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("");
		}
	}
}