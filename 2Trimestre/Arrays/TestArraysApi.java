package Arrays;
import java.util.Arrays;
public class TestArraysApi {
    public static void main(String[] args) {
        // Test del método fill()
        System.out.println("Test de Arrays.fill():");
        int[] numeros = new int[6];
        Arrays.fill(numeros, 42);
        System.out.println(Arrays.toString(numeros));

        // Test del método sort()
        System.out.println("\nTest de Arrays.sort():");
        int[] valoresDesordenados = {10, 7, 23, 15, 8};
        Arrays.sort(valoresDesordenados);
        System.out.println(Arrays.toString(valoresDesordenados));

        // Test del método binarySearch()
        System.out.println("\nTest de Arrays.binarySearch():");
        int[] numerosOrdenados = {7, 8, 10, 15, 23};
        int indiceEncontrado = Arrays.binarySearch(numerosOrdenados, 15);  
        System.out.println("Índice de 15: " + indiceEncontrado); 
        indiceEncontrado = Arrays.binarySearch(numerosOrdenados, 5);  
        System.out.println("Índice de 5: " + indiceEncontrado);

        // Test del método toString()
        System.out.println("\nTest de Arrays.toString():");
        int[] numerosParaCadena = {4, 9, 12, 21};
        System.out.println(Arrays.toString(numerosParaCadena)); 

        // Test del método copyOf()
        System.out.println("\nTest de Arrays.copyOf():");
        int[] original = {1, 3, 5, 7};
        int[] copiaMayor = Arrays.copyOf(original, 6); 
        System.out.println(Arrays.toString(copiaMayor)); 

        int[] copiaMenor = Arrays.copyOf(original, 2);  
        System.out.println(Arrays.toString(copiaMenor));
    }
}