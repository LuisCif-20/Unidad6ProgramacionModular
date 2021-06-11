package src;
import java.util.*;
public class Ejercicio5{
	public static void main(String[] args) {
		Ejercicio5 e5 = new Ejercicio5("Estamos en Ejercicio5");
	}

	int [] notas = new int[100];
	int totalnotas;
	int i = 0;
	int promedio;
	Scanner scan = new Scanner(System.in);

	public Ejercicio5(String mensaje){
		System.out.println(mensaje);
		ingresarNotas();
		calcularPromedio();
		calcularSugerencia();
	}
	public void ingresarNotas(){
		int seguir = 0;
		System.out.println("El sistema se cerrara cuando ingrese un numero mayor a 10");
		System.out.println("Si ya no desea ingresar mas notas, ingrese un numero mayor a 10");
		do {
			System.out.println("Ingrese la nota");
			seguir = scan.nextInt();
			if (seguir > 10) {
				notas[i] = -50;
				i--;
			} else {
				notas[i] = seguir;
				i++;
			}

		} while (seguir <= 10 & i < 100);
	}
	public void calcularPromedio(){
		for (int j = 0; j < i ; j++ ) {
			totalnotas += notas[j];
		}
		promedio = totalnotas/i;
		System.out.println("La nota media es " + promedio);
	}
	public void calcularSugerencia(){
		int prom1 = (5+7+2+3+9+5+6+8)/8;
		System.out.println("El promedio del conjunto 1 es " + prom1);
		int prom2 = (6)/1;
		System.out.println("El promedio del conjunto 2 es " + prom2);
		int prom3 = (1+5+4+7+6+2+7+8+3+2+9+4+5+3+6+6+8+8)/18;
		System.out.println("El promedio del conjunto 3 es " + prom3);
	}
}