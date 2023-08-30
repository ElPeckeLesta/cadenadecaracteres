/* Realiza un programa que reemplace todas las apariciones de un carácter en una cadena de caracteres 
 ingresada por el usuario por otro carácter también ingresado por el usuario. */
package cadenadecaracteres;
import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una palabra ");
		String palabra = scanner.nextLine();
		System.out.print("Ahora ingresa la letra que queres reemplazar ");
		char letra = scanner.nextLine().charAt(0);
		System.out.print("Ahora ingresa el caracter que queres que reemplace la letra ");
		char letraReemplazada = scanner.nextLine().charAt(0);
		
		for(int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == letra) {
				 StringBuilder nuevaPalabra = new StringBuilder(palabra);
				 nuevaPalabra.setCharAt(i, letraReemplazada);
				 palabra = nuevaPalabra.toString();
			}
		}
		System.out.print(palabra);
	
	}

}
