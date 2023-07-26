/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;
import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int number = scan.nextInt();
        if(number>0){
            System.out.println( number+" is a Positive Number");
        }else
            System.out.println(number+" is a Negative Number");
    }
}
