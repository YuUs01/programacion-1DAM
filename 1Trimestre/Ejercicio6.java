//Este algoritmp, muestra los numeros pares empezando por el 100 y llegando al 200 (50 núemros)
package traduccionejercicios;

public class Ejercicio_6 {

	public static void main(String[] args) {

		System.out.println("A continuación, se van a mostra los números pares que van del 100 al 200");
		int num;
		num=100;
		System.out.println(num);
		
		while (num<200) {
			num+= 2;
			System.out.println(num);
		}
	}
}
