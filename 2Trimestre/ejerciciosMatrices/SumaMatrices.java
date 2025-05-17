package ejerciciosMatrices;
/**
 * 
 */
public class SumaMatrices {

	public static void main(String[] args) {

		int [] [] A = {
				{1, 2, 5},
				{3, 4, 9},
				{5, 6, 8}
		};
		int [] [] B = {
				{1, 2, 3},
				{3, 4, 6},
				{5, 8, 10}
		};
		int [] [] resultado = new int [3] [3] ;
		if(A.length!=B.length) {
			throw new IllegalArgumentException("Los arrays no tienen la misma longitud");
		}else {
			//inicio del código para sumar
			for (int i=0; i<A.length; i++) {
				for (int j=0; j<A[i].length; j++) {
					resultado[i][j] += A[i][j];
				}
			}
			for (int i=0; i<B.length; i++) {
				for (int j=0; j<B[i].length; j++) {
					resultado[i][j] += B[i][j];
				}
			}
			//fin del código para la suma

			//inicio del codigo para mostrar los valores sumados
			for (int i=0; i<resultado.length; i++) {
				for (int j=0; j<resultado[i].length; j++) {
					System.out.print(resultado[i][j] + " ");
				}
				System.out.println("");
			}
			//fin del codigo para mostrar los valores sumados
		}
	}
}