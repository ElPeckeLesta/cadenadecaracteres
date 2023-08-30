/* Realiza un programa que determine si una cadena de caracteres ingresada 
 * por el usuario es un anagrama de otra cadena también ingresada por el usuario. 
 * Un anagrama es una palabra o frase formada por las mismas letras de otra palabra o frase, 
 * pero en un orden diferente, como por ejemplo "roma" y "amor". */
package cadenadecaracteres;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una palabra o frase: ");
		String palabra = scanner.nextLine();
		System.out.print("Ingresa otra palabra o frase: ");
		String palabra2 = scanner.nextLine();
		
		if(palabra.length() != palabra2.length()) {
			System.out.print("No es anagrama");
			return;
		}
		
	
		for(int i = 0; i < palabra.length(); i++) {
			boolean verificator = false;
			for(int j = 0; j < palabra2.length(); j++) {
				if(palabra.charAt(i) == palabra2.charAt(j)) {
					verificator = true;
					break;
				}
			}
			if(!verificator) {
				System.out.print("No es anagrama");
				return;
			}
		}
		System.out.print("Es un anagrama");
	}
}
