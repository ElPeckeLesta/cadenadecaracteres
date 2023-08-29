/* Pedir al usuario que ingrese su nombre y luego imprimirlo en pantalla. */
package cadenadecaracteres;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		System.out.print("<-> Ingrese su nombre: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String nombre = scanner.nextLine();
		scanner.close();
		
		System.out.println("Hola" + nombre + " Bienvenido!");

	}

}
