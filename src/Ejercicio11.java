package src;
import java.util.*;
public class Ejercicio11{
	public static void main(String[] args) {
		Ejercicio11 e11 = new Ejercicio11("Estamos en el Ejercicio11");
	}

	double[] nota = new double[6];
	String[] alumno = new String[6];
	String[] resultado = new String[6];
	Scanner scan = new Scanner(System.in);

	public Ejercicio11(String mensaje){
		System.out.println(mensaje);
		perdirDatos();
		generarResultado();
		mostrarTodo();
	}

	public void perdirDatos(){
		for (int i = 0; i < 6 ;i++ ) {
			System.out.println("Ingrese el nombre del alumno");
			alumno[i] = scan.nextLine();
			System.out.println("Ingrese la nota del alumno ingresado");
			nota[i] = scan.nextInt();
			scan.nextLine();
		}
	}
	public void generarResultado(){
		for (int i = 0; i < 6 ;i++ ) {
			if (nota[i] < 5 & nota[i] > 0) {
				resultado[i] = "Suspenso";
			} else if (nota[i] < 7) {
				resultado[i] = "Bien";
			} else if (nota[i] < 8) {
				resultado[i] = "Notable";
			} else if (nota[i] <= 10) {
				resultado[i] = "Sobresaliente";
			}
		}
	}
	public void mostrarTodo(){
		for (int i = 0; i < 6 ;i++ ) {
			System.out.println("Alumno: " + alumno[i] + "   Nota: " + nota[i] + "   Resultado: " + resultado[i]);
		}
	}
}