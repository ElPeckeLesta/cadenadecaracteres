/* Realiza un programa que cuente cuántas vocales tiene una cadena de caracteres ingresada por el usuario. */
package cadenadecaracteres;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		System.out.print("<-> Ingresa la palabra de la que quieras saber la cantidad de vocales: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String palabra = scanner.nextLine();
		scanner.close();
		
		int count = 0;
		
		for(int i = 0; i < palabra.length(); i++) {
			char caracter = Character.toLowerCase(palabra.charAt(i));
			
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
					count++;
				}
			}
		
		System.out.println("La cantidad de vocales de tu palabra es: " + count);

	}

}
