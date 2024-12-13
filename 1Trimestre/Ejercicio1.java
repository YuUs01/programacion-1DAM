package ejerciciosJava1Trimestre;
import java.util.Scanner;
public class Ejercicio_1 {
	public static void main(String[] args) {
		
		System.out.println("Introduzca su fecha de nacimiento en formato dd/mm/aa");
		
		int diaNacimiento,mesNacimiento,anoNacimiento,diaActual,mesActual,anoActual;
			
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
			diaNacimiento = scanner.nextInt();
			mesNacimiento = scanner.nextInt();
			anoNacimiento = scanner.nextInt();
			
		System.out.println("Introduzca la fecha actual en formato dd/mm/aa");	
			diaActual = scanner.nextInt();
			mesActual = scanner.nextInt();
			anoActual = scanner.nextInt();
			
		if (anoActual-anoNacimiento>65) {
			System.out.println("Usted puede jubilar");
		}else{
			if (anoActual-anoNacimiento==65) {
				if (mesActual>mesNacimiento) {	
					System.out.println("Usted puede jubilar");				
					
				}else {
					if (mesActual==mesNacimiento) {
						if(diaActual>=diaNacimiento) {
							System.out.println("Usted puede jubilarse");
						}
					}
				}	
			}
		}
		if(anoActual-anoNacimiento<65) {
			System.out.println("Usted no puede jubilarse");
		}else {
			if(anoActual-anoNacimiento==65) {
				if(mesActual<mesNacimiento) {
					System.out.println("Usted no puede jubilarse");
				}else {
					if(mesActual==mesNacimiento) {
						if(diaActual<diaNacimiento) {
							System.out.println("Usted no puede jubilarse");
						}
					}
				}
			}
		}
	}
}
