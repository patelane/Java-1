/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//NAME: ANEE PATEL
//STUDENT NUMBER: 991548757
//PROGRAM: COMPUTER SYSTEMS TECNOLOGY-SYSTEM ANALYST
package assignment2;
import java.util.Scanner;
/**
 *
 * @author aneen
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);//create a scanner object
        System.out.println("Enter the number of items in the store:");//promts user to enter the number of items i.e. the size of array
        int size=inp.nextInt();
        double[] Total=new double[size];
        double[] Quantity=new double[size];
        double[] Price=new double[size];
        double sum=0;
        String[] Itemname=new String[size];
        
        for(int i=0;i<Quantity.length;i++)
        {
            System.out.println("Enter the quantity of item:");//promts user to enter the quantity
            Quantity[i]=inp.nextDouble();
        
            System.out.println("Enter the price of item:");//promts user to enter the price
            Price[i]=inp.nextDouble();
        
            System.out.println("Enter the name of item:");//promts user to enter the name
            Itemname[i]=inp.next();
        
            Total[i]=Quantity[i]*Price[i];//computing the total price of each item
        }
        for(int i=0;i<Quantity.length;i++)
        {
            sum=sum+Total[i];//computing the total cost of all items
        }
        //Displaying the bill
        System.out.println("ItemName\tQuantity\tUnit Price\tTotal");
        for(int i=0;i<Quantity.length;i++)
        {
            System.out.println(Itemname[i]+"\t"+Quantity[i]+"\t$"+Price[i]+"\t$"+Total[i]);
        }
        
        System.out.println("\nFinalTotal\t\t\t$"+sum);
        
    }
}
