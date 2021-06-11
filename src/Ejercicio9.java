package src;
import java.util.*;
public class Ejercicio9{
	public static void main(String[] args) {
		Ejercicio9 e9 = new Ejercicio9("Estamos en Ejercicio9");
	}

	int[][] matriz1;
	int[][] matriz2;
	int filas = 0;
	int columnas = 0;
	Scanner scan = new Scanner(System.in);

	public Ejercicio9(String mensaje){
		System.out.println(mensaje);
		crearMatriz();
		verificarSuma();
	}
	public void crearMatriz(){
		for (int i = 0; i<2 ;i++ ) {
			System.out.println("Ingrese las filas de la matriz " + (i+1));
			filas = scan.nextInt();
			System.out.println("Ingrese las columnas de la matriz " + (i+1));
			columnas = scan.nextInt();
			if (i == 0) {
				matriz1 = new int[filas][columnas];
				llenarMatriz(1);
			} else {
				matriz2 = new int[filas][columnas];
				llenarMatriz(2);
			}
		}
	}
	public void llenarMatriz(int num){
		System.out.println("Ingrese los datos de la matriz " + num);
		if (num == 1) {
			for (int i = 0; i<matriz1.length ; i++) {
				for (int j = 0; j < matriz1[i].length;j++ ) {
					System.out.println("Ingrese el dato de la posicion [" + (i+1) +"][" + (j+1) + "]");
					matriz1[i][j] = scan.nextInt();
				}
			}
		} else {
			for (int i = 0; i<matriz2.length ; i++) {
				for (int j = 0; j < matriz2[i].length;j++ ) {
					System.out.println("Ingrese el dato de la posicion [" + (i+1) +"][" + (j+1) + "]");
					matriz2[i][j] = scan.nextInt();
				}
			}
		}
	}
	public void verificarSuma(){
		if (matriz1.length == matriz2.length & matriz1[1].length == matriz2[1].length) {
			int[][] suma = new int[filas][columnas];
			for (int i = 0; i < filas ; i++ ) {
				for (int j = 0;j < columnas ; j++ ) {
					suma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			imprimirMatriz(suma);
		} else {
			System.out.println("No se pueden sumar");
		}
	}
	public void imprimirMatriz(int[][] matriz){
		System.out.println("La suma de las matrices es la siguiente matriz");
		for (int i = 0; i < matriz.length ; i++ ) {
			for (int j = 0; j < matriz[i].length  ; j++ ) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}
}