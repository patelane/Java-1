/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5;
import java.util.Scanner;

/**
 *
 * @author aneen
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length:");
        double l=input.nextDouble();
        System.out.println("Enter width:");
        double w=input.nextDouble();
        System.out.println("Enter price per sq foot:");
        double p=input.nextDouble();
        double area=l*w;
        double cost=area*p;
        int rcost=(int)(cost*100);
        int dollars=rcost/100;
        rcost=rcost%100;
        int cents=rcost;
        System.out.println("Length="+l+"\nwidth="+w+"\nfloor space is :"+area+"sq feet"+"\nCost:"+cost+"/nDollars:"+dollars+"\nCents:"+cents);
//        
        

Scanner inp=new Scanner(System.in);
System.out.println("Enter fahrenheit:");
double fah=inp.nextDouble();
double cel=(double)5/9*fah-32;
System.out.println("Celcius:"+cel);
    }
    
}
