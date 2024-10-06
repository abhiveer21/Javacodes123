package lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author abhiv
 */
public class Lab1Q4 {
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print("FizzBuzz ");
            }
            else if(i%3==0)
            {
                System.out.print("Fizz ");
            }
            else if(i%5==0)
            {
                System.out.print("Buzz ");
            }
            else
            {
                System.out.print(i + " ");
            }
            
        }
    }
}
