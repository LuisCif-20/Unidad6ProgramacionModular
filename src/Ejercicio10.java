package src;
import java.util.*;
public class Ejercicio10{
	public static void main(String[] args) {
		Ejercicio10 e10 = new Ejercicio10("Estamos en el Ejercicio10");
	}

	int[][] matriz1 = new int[3][4];
	int[][] matriz2 = new int[4][3];
	Scanner scan = new Scanner(System.in); 

	public Ejercicio10(String mensaje){
		System.out.println(mensaje);
		llenarMatriz();
		System.out.println("La matriz traspuesta es: ");
		trasponerMatriz();
		for (int i=0; i<4 ; i++) {
			for (int j = 0; j <3 ;j++ ) {
				System.out.print(matriz2[i][j] + "    ");
			}
			System.out.println("");
		}
	}
	public void llenarMatriz(){
		for (int i=0; i<3 ;i++ ) {
			for (int j=0; j<4 ;j++ ) {
				System.out.println("Ingresa el valor de la posición [" + (i+1) + "][" + (j+1) + "]" );
				matriz1[i][j] = scan.nextInt();
			}
		}
	}
	public void trasponerMatriz(){
		for (int i = 0; i<4 ;i++ ) {
			for (int j =0; j<3 ; j++ ) {
				matriz2[i][j]=matriz1[j][i];
			}
		}
	}
}