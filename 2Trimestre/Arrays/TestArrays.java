package Arrays;

public class TestArrays {
	//Test de mi clase Arrays
    public static void main(String[] args) {
        // Test del método fill()
        System.out.println("Test de fill():");
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));
        
        // Test del método sort()
        System.out.println("\nTest de sort():");
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // Test del método binarySearch()
        System.out.println("\nTest de binarySearch():");
        int[] arr3 = {1, 2, 5, 5, 6, 9};
        int index = Arrays.binarySearch(arr3, 5);
        System.out.println("Índice de 5: " + index);
        index = Arrays.binarySearch(arr3, 10);
        System.out.println("Índice de 10: " + index);
        
        // Test del método toString()
        System.out.println("\nTest de toString():");
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr4));

        // Test del método copyOf()
        System.out.println("\nTest de copyOf():");
        int[] arr5 = {1, 2, 3, 4, 5};
        int[] copyArr = Arrays.copyOf(arr5, 7); 
        System.out.println(Arrays.toString(copyArr));

        int[] copyArr2 = Arrays.copyOf(arr5, 3);
        System.out.println(Arrays.toString(copyArr2));
    }
}
