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
public class Lab1Q3 {
    
    public static boolean isPrime(int num){
            if(num<=1)return false;
            else{
                for(int i=2;i<num;i++){
                    if(num%i == 0){
                        return false;
                    }
                }
                return true;
            }
        }
    
    
    public static void main(String[] args){
        
        System.out.println("Enter array length: ");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Input array numbers");
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Prime numbers in array are:");
        for(int i=0;i<n;i++)
        {
            if(isPrime(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
        }
}


