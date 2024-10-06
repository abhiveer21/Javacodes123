/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author abhiv
 */
public class Lab1Q6 {
    public static void main(String[] args) 
    {
        // Obtain the total milliseconds since midnight, January 1, 1970
        long totalMsec = System.currentTimeMillis();

        // Obtain the total seconds since midnight, January 1, 1970
        long totalSec = totalMsec / 1000;

        // Compute the current second
        long currentSec = totalSec % 60;

        // Obtain the total minutes since midnight, January 1, 1970
        long totalMin = totalSec / 60;

        // Compute the current minute
        long currentMin = totalMin % 60;

        // Obtain the total hours since midnight, January 1, 1970
        long totalHrs = totalMin / 60;

        // Compute the current hour (in GMT)
        long currentHr = totalHrs % 24;

        // Display results
        System.out.println(currentHr + ":" + currentMin + ":" + currentSec);
    }

}
