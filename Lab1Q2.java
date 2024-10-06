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
public class Lab1Q2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i=0;
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int max=sc3.nextInt();
        while (i<num-1){
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num2=sc2.nextInt();
            if (max<num2){
                max=num2;
            }
            i++;
        }
        System.out.println("Max Number is: "+max);  
    }
}
