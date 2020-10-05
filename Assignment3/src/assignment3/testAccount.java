/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;
/**
 *
 * @author aneen
 */
public class testAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your id:");
        int id=inp.nextInt();
        System.out.println("Enter balance:");
        double balance=inp.nextDouble();
        System.out.println("Enter the annual interest rate(it will be counted as percentage):");
        double annualInterestRate=inp.nextDouble();
        System.out.println("Enter the amount you want to withdraw:");
        double w=inp.nextDouble();
        System.out.println("Enter the amount you want to deposit:");
        double d=inp.nextDouble();
        
        account a1=new account();
        account a2=new account(id, balance, annualInterestRate);
        
        System.out.println("~~~~~No argument constructor output~~~~~");
        System.out.println("Id="+a1.getId()+"\nOriginal balance=$"+a1.getBalance()+"\nAnnual interest rate="+a1.getAnnualInterestRate());
        System.out.println("Balance after withdrawl=$"+a1.withdraw(w));
        System.out.println("Balance after deposit=$"+a1.deposit(d));
        System.out.println("Final Balance=$"+a1.getBalance());
        System.out.printf("Monthly interest=$%5.2f",a1.getMonthlyInterest());
        
        System.out.println("\n\n~~~~~Argument constructor output~~~~~");
        System.out.println("Id="+a2.getId()+"\nOriginal balance=$"+a2.getBalance()+"\nAnnual interest rate="+a2.getAnnualInterestRate());
        System.out.println("Balance after withdrawl=$"+a2.withdraw(w));
        System.out.println("Balance after deposit=$"+a2.deposit(d));
        System.out.println("Final Balance=$"+a2.getBalance());
        System.out.printf("Monthly interest=$%5.2f",a2.getMonthlyInterest());
        
    }
    
}
