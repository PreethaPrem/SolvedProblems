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
public class Star {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){
            for (int j=1;j<6;j++){
             System.out.print("*");
            }System.out.println(" ");
        }
        System.out.println("");
        for (int i=1;i<6;i++){
            for (int j=1;j<=i;j++){
             System.out.print("*");
            }System.out.println("");
        }
        System.out.println("");
         for (int i=5;i>=0;i--){
            for (int j=1;j<=i;j++){
             System.out.print("*");
            }System.out.println("");
        }
    }
}
