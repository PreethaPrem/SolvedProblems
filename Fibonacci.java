/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author systech
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("It's a Fibonacci Series of first 15 Number's");
        int x=0,y=1,z;
        for (int i=0;i<15;i++){
            z=x+y;
            System.out.println(x);
            x=y;
            y=z;
        }
    }
}
