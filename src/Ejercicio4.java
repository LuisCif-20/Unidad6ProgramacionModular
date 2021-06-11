package src;
import java.util.*;
public class Ejercicio4{
	int[] numeros = new int[10];
	Random ale = new Random();
	int nummayor = 0;
	public static void main(String[] args) {
		Ejercicio4 e4 = new Ejercicio4("Estamos en Ejercicio4");
	}
	public Ejercicio4(String mensaje){
		System.out.println(mensaje);
		generarnumeros();
		hallarnumeromayor();
		System.out.println("El numero mayor es: " + nummayor);
		hallardistancia();
	}
	public void generarnumeros(){
		for (int i = 0; i < 10 ; i++ ) {
			numeros[i] = ale.nextInt();
			System.out.println(numeros[i]);
		}
	}
	public void hallarnumeromayor(){
		for (int i = 0; i < 10 ; i++ ) {
			if (numeros[i] >= nummayor) {
				nummayor = numeros[i];
			}
		}
	}
	public void hallardistancia(){
		for (int i = 0; i < 10 ; i++ ) {
			int distancia = nummayor - numeros[i];
			System.out.println("La distancia entre el valor " + numeros[i] + " y el numero mayor es de " + distancia);
		}
	}
}