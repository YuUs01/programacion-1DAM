
package traduccionejercicios;
import java.util.Scanner;
public class Ejercicio_2 {

	
	public static void main(String[] args) {
		
		double areaCirculo,radio;
		
		double pi=3.14;
		
		System.out.println("Para visualizar el área de su círculo, introduzca su radio.");
		Scanner scanner = new Scanner(System.in);
		radio = scanner.nextInt();
		
		areaCirculo = (pi * radio * radio);
		
		System.out.println(areaCirculo);
	}
}
