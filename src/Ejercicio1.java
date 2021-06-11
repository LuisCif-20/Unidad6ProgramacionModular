package src;
import java.util.*;
public class Ejercicio1{
	public static void main(String[] args) {
		Ejercicio1 e1 = new Ejercicio1("Estamos en Ejercicio1");
	}
	int[] numeros = new int[5];
	Scanner scan = new Scanner(System.in);
	public Ejercicio1(String mensaje){
		System.out.println(mensaje);
		pedirNumeros();
		mostrarValores();

	}
	public void mostrarValores(){
		for (int i=0; i<5 ;i++ ) {
			System.out.println("En el indice " + i + " se encuentra el valor " + numeros[i]);
		}
	}
	public void pedirNumeros(){
		for (int i = 0; i<5 ;i++ ) {
			System.out.println("Ingresa el numero");
			numeros[i] = scan.nextInt();
		}
	}

}