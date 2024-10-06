/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author abhiv
 */
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void show_count() {
        System.out.printf("num objects created > %d\n", count);
    }
}

public class q2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter.show_count();
        Counter c2 = new Counter();
        Counter.show_count();
        Counter c3 = new Counter();
        Counter.show_count();
    }
}
