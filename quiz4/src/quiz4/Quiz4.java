/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//NAME: ANEE PATEL
//STUDENT NUMBER: 991548757
//PROGRAM: COMPUTER SYSTEMS TECNOLOGY-SYSTEM ANALYST
package quiz4;
import java.util.Scanner;
/**
 *
 * @author aneen
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);//create a scanner object
        System.out.println("Enter any integer:");//promts user to enter the integer value
        int n=input.nextInt();//read the value
        System.out.println("Sum of digits in a number="+sumDigits(n));//invoking a method and printing the result
    }
    public static int sumDigits(int n)//defining a method
    {
        int sum=0;
        while(n!=0)//using while loop
        {
            sum=sum+n%10;//n%10 gives the remainder 
            n/=10;//getting quotient
        }
        return sum;//return value
    }
}
