package src;
import java.util.*;
public class Ejercicio8{
	public static void main(String[] args) {
		Ejercicio8 e8 = new Ejercicio8("Estamos en Ejercicio8");
	}

	String[] array1 = new String[5];
	String[] array2 = new String[5];
	Scanner scan = new Scanner(System.in);

	public Ejercicio8(String mensaje){
		System.out.println(mensaje);
		llenarArrays();
		contarLetras();
	}
	public void llenarArrays(){
		for (int i = 0; i < 2 ;i++ ) {
			System.out.println("Ingrese lo que se le solicita para el Array " + (i+1));
			for (int j = 0; j<5 ; j++ ) {
				if (i == 0) {
					System.out.println("Ingrese una palabra");
					array1[j] = scan.nextLine();
				} else {
					System.out.println("Ingrese una palabra");
					array2[j] = scan.nextLine();
				}
			}
		}
	}

	public void contarLetras(){
		for (int i = 0; i < 5 ; i++ ) {
			System.out.println("En la posicion " + i + " del Array1 hay " +array1[i].length()+ " letras");
			System.out.println("En la posicion " + i + " del Array1 hay " +array2[i].length()+ " letras");
			if (array1[i].length() == array2[i].length()) {
				System.out.println("Son iguales");
			} else {
				System.out.println("No son iguales");
			}
		}
	}

}