//Este ejercicio, calcula el perímetro de un círculo con el radio introducido por el usuario por consola.
package traduccionejercicios;
import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		double perimetroCirculo,radio;
		double pi=3.14;
		
		System.out.println("Para visualizar el perímetro de su círculo, introduzca su radio.");
		Scanner scanner = new Scanner(System.in);
		radio = scanner.nextInt();
		perimetroCirculo=(pi * 2 * radio);
		
		System.out.println("El perimetro de su circulo es:");
		System.out.println(perimetroCirculo);
	}
}
