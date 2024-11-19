package Arrayss;


import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {
        // First array of integers
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Second array of strings
        String[] strArray = {"apple", "orange", "banana", "grape"};

        // Create a new array to hold both integers and strings (Object array)
        Object[] combinedArray = new Object[intArray.length + strArray.length];

        // Copy the elements from the integer array
        System.arraycopy(intArray, 0, combinedArray, 0, intArray.length);

        // Copy the elements from the string array
        System.arraycopy(strArray, 0, combinedArray, intArray.length, strArray.length);

        // Print the combined array
        System.out.println("Combined Array: " + Arrays.toString(combinedArray));
	}

}
