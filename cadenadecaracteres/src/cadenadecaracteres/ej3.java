/* Realiza un programa que determine si una cadena de caracteres ingresada por el usuario es palíndromo 
 (se lee igual de izquierda a derecha que de derecha a izquierda). */
package cadenadecaracteres;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
		System.out.print("<-> Ingresa una palabra y te voy a decir si es o no palindroma: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String palindromo = scanner.nextLine();
		scanner.close();
		
		for(int i = 0; i < palindromo.length(); i++) {
			for(int j = palindromo.length() - 1; j >= 0; j--) {
				
				char esPalindromoI = Character.toLowerCase(palindromo.charAt(i));
				char esPalindromoJ = Character.toLowerCase(palindromo.charAt(j));
				
				if(esPalindromoI != esPalindromoJ) {
					System.out.println("No es palindromo");
					return; 
				} 
				break;
			}
		}
			System.out.println("La palabra " + palindromo + " es palindroma");
	}

}
