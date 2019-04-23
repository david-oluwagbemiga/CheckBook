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
public class Transaction extends Variables {
    
      
    
    //importing the scanner class to take user input through the program.
    
    
    Scanner sc = new Scanner(System.in);
    
    
    //the first method to  take in the user's deposit.
    
    
    private double setterDeposit(){
        System.out.println("Enter the ammount you want to deposite");
        //taking the user input
        this.deposit = sc.nextDouble();
        System.out.println("your balance is: " + deposit);
        return deposit;
    }
    
    
    //the second method to give the user his/ her money that was deposited using the first method.
     private double setterWithdraw(){
        System.out.println("Enter the ammount you want to withdraw");
        //taking the user input
        this.WithDraw = sc.nextDouble();
        return this.WithDraw;
     }
     
     
     
     //this is the third method to tell the user his /  her balance
     private double balance(){
         this.balance = (deposit - WithDraw);
         System.out.println("your balance is: " + balance);
         return balance;
     }
     
     
     // this is the forth method to tell the user his / her current balance
     
     
     
     private double setternewBalance(){
         if(WithDraw <= balance){
         newBalance = (balance -  WithDraw);
         System.out.println("your balance is: " + this.newBalance);
     }else{
             System.out.println("insuffient Funds!");
         }
         return this.newBalance;
         
     }
    
     
     //this is the fifth method to tell the user his / her current balance after more than one withdrawal
     
     
     
     private double setternewBalance1(){
         if(WithDraw <= newBalance){
         newBalance = (newBalance - WithDraw);
         System.out.println("your balance is: " + this.newBalance);
         }else{
             System.out.println("insuffient Funds!");
         }
         return this.newBalance;
     }
     
     
     
     //this is the sixth method that does all the transaction carried out through the program
     
     
     
     public void Transaction(){
         Transaction obj = new Transaction();
         // to deposite money
          System.out.println("please what transaction would like to perform: ");
         System.out.println("1. To Deposit money press 1, ");
         System.out.println("2. To Withraw Money press 2");
         byte choice = sc.nextByte();
         if(choice == 1){
             obj.setterDeposit();
             obj.balance();
             
         }
         
         // to redraw money
         if(choice == 2){
        System.out.println("please deposit money First");
        obj.setterDeposit();
        obj.balance();
        obj.setterWithdraw();
        obj.setternewBalance();
        System.out.println("do you want to redraw again?, press 6");
        //to redraw money more than once
        byte choice1 = sc.nextByte();
        while(choice1 == 6){
        obj.setterWithdraw();
        obj.setternewBalance1();
        System.out.println("do you want to redraw again?, press 5");
        byte choice2 = sc.nextByte();
        while(choice2 == 5){
        obj.setterWithdraw();
        obj.setternewBalance1();
        break;
        }
        break;
         }
         }
     }
    
}
