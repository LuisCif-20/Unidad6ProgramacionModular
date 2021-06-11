package src;
import java.util.*;
public class Ejercicio3{
	int[] numeros = new int[8];
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Ejercicio3 e3 = new Ejercicio3("Estamos en Ejercicio3");
	}
	public Ejercicio3(String mensaje){
		System.out.println(mensaje);
		ingresarnumeros();
		System.out.println("Ingresa el numero a buscar");
		int num = scan.nextInt();
		if (buscarnumero(num)) {
			System.out.println("Verdadero");
		} else {
			System.out.println("Falso");
		}

	}
	public void ingresarnumeros(){
		for (int i = 0 ; i < 8 ; i++ ) {
			System.out.println("Ingrese el numero");
			numeros[i] = scan.nextInt();
		}
	}
	public boolean buscarnumero(int numero){
		for (int i = 0; i<8 ; i++ ) {
			if (numero == numeros[i]) {
				return true;
			}

		}
		return false;
	} 
}