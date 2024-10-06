/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author abhiv
 */
public class Lab1Q8 {
    
    public static void insertionSort(double[] array) 
    {
        for (int i = 1; i < array.length; i++) 
        {
            double currentElement = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentElement;
        }
    }

    // Binary search method
    public static int binarySearch(double[] array, double key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid; 
            }
            if (array[mid] < key) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

    
        insertionSort(numbers);

        System.out.println("Sorted numbers:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Search Number: ");
        double key = input.nextDouble();

        int result = binarySearch(numbers, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

}
