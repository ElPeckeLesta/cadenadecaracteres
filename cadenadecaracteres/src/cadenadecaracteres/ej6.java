/* Realizar un programa que ingrese 5 palabras y devuelva la cadena m�s larga entre ellas */
package cadenadecaracteres;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraLarga = "";
        
        System.out.print("Ingresa cinco palabras: ");

        for (int i = 0; i < 5; i++) {
            String palabra = scanner.next();

            if (palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }
        }

        System.out.println("La palabra m�s larga es: " + palabraLarga);
    }
}