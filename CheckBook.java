/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction;

import java.util.Scanner;

/**
 *
 * @author david Oluwagbemiga
 */
public class CheckBook extends Transaction{
       
     
     //the last method which is the main method that implements all the methods in our program via the use of an object.
     
     
     
     public static void main(String[] args) {
         //we created the object here
        CheckBook objTwo = new CheckBook();
        Scanner sc = new Scanner(System.in);
        //implementing the object
        objTwo.Transaction();
         System.out.println("press any number to 0 to exit or 1 to restart .");
         //taking the user input
         byte close = sc.nextByte();
         if(close == 1){
             objTwo.Transaction();
         }else{
             System.out.println("bye");
         }
        
        
    }
}
