/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author abhiv
 */
public class Lab1Q7 {
    
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
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

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
    }
}
