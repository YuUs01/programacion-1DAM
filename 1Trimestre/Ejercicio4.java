//Este ejercicio, evalúa el día de la semana dependiendo del numero (ente 1 y 7) introducido por el usuario.
package traduccionejercicios;
import java.util.Scanner;
public class Ejercicio_4{

	public static void main(String[] args) {

		int diaSemana;
		
		System.out.println("Introduzca un dia de la semana del 1 al 7");
	
		Scanner scanner = new Scanner(System.in);
		diaSemana = scanner.nextInt();
		
		switch (diaSemana) {
			case 1:
				System.out.println("El dia de la semana es Lunes");
				break;
			case 2:
				System.out.println("El dia de la semana es Martes");
				break;
			case 3:
				System.out.println("El dia de la semana es Miércoles");
				break;
			case 4:
				System.out.println("El dia de la semana es Jueves");
				break;
			case 5:
				System.out.println("El dia de la semana es Viernes");
				break;
			case 6:
				System.out.println("El dia de la semana es Sábado");
				break;
			case 7:
				System.out.println("El dia de la semana es Domingo");
				break;
			default:
				System.out.println("El dato introducido no es válido");
		}
	}
}
