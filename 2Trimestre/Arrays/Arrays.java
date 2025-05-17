package Arrays;

public class Arrays {
	public static void fill(int a[], int val) {
		for (int i=0; i<a.length; i++) {
			a[i]=val;
		}
	}
	public static void sort(int[] a) {

		boolean cambio;

		// Algoritmo de Bubble Sort
		for (int i = 0; i <a.length-1; i++) {
			cambio = false;

			for (int j = 0; j < a.length- i - 1; j++) {
				if (a[j] > a[j + 1]) {
					// Intercambiar los elementos
					int aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
					cambio = true;
				}
			}
			if (!cambio) {
				break;
			}
		}
	}
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {

			int middle = left + (right - left) / 2;

			if (array[middle] == target) {
				return middle;
			}
			if (array[middle] > target) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
	}
	public static String toString(int a []) {
		String s="";
		s+="{";
		for (int i=0; i<a.length-1; i++) {
			s+=a[i];
			s+=", ";
		}
		s+=a[a.length-1];
		s+="}";
		return s;
	}
	public static int [] copyOf(int[]a ,int longitud) {
		int[] arrayNuevo = new int[longitud];
		for (int i = 0; i < Math.min(a.length, longitud); i++) {
			arrayNuevo[i] = a[i];
		}
		return arrayNuevo;
	}
}