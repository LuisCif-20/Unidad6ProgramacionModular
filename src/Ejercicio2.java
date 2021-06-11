package src;
import java.util.*;
public class Ejercicio2{
	int[] numeros = new int[10];
	Random aleatorio = new Random();
	int nummayor = 0;
	public static void main(String[] args) {
		Ejercicio2 e2 = new Ejercicio2("Estamos en Ejercicio2");
	}
	public Ejercicio2(String mensaje){
		System.out.println(mensaje);
		System.out.println("Los numeros generados son:");
		generarNumeros();
		encontrarnumeromayor();
		System.out.println("El numero mayor es: " + nummayor);
		System.out.println("Se repite: " + contarRepeticion(nummayor)  );
	}
	public void generarNumeros(){
		for (int i = 0; i<10 ;i++ ) {
			numeros[i] = aleatorio.nextInt(100);
			System.out.println(numeros[i]);
		}
	}
	public void encontrarnumeromayor(){
		for (int i = 1; i < 10 ; i ++ ) {
			if (numeros[i] >= nummayor) {
				nummayor = numeros[i];
			}
		}
	}
	public int contarRepeticion(int grande){
		int contador = 0;
		for (int i = 0; i < 10 ; i ++ ) {
			if (grande == numeros[i]) {
				contador++;
				return contador;
			}

		}
		return contador;
	}
}