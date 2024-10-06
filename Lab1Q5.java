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
public class Lab1Q5 {


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double Ir,Mir;
        int Nyrs,Nm;
        double lamt,monthlypay;
        
        System.out.println("Enter interest rate");
        Ir=sc.nextFloat();
        Mir=Ir/12;
        System.out.println("number of years");
        Nyrs=sc.nextInt();
        Nm=Nyrs*12;
        
        System.out.println("loan amount");
        lamt=sc.nextFloat();
        
        monthlypay=lamt*Mir/(1-(1/(Math.pow((1+Mir),Nm))));
        
        System.out.printf("Monthly payment: %.2f", monthlypay);
    }    
}


