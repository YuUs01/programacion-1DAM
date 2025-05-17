package ejerciciosMatrices;
import java.util.Scanner;
public class ProductoMatrices {
	public static void main(String[] args) {

		int [] [] A = {
				{2, 3, 5},
				{3, 6, 2},
				{6, 7, 1}
		};
		
		int [] [] B = {
				{1, 1, 2},
				{4, 9, 2},
				{1, 7, 1}
		};
		int [] [] resultado = new int [3][3];

		//inicio del código que multiplica las matrices
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				resultado[i][j] = 0;
				for (int k = 0; k < A.length; k++) { 
					resultado[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		//inicio del código que visualiza por pantalla la matriz resultante
		System.out.println("La matriz resultante del producto de A y B es:");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
		}
	}
}