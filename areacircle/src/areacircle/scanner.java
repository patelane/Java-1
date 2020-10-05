/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacircle;
import java.util.Scanner;

/**
 *
 * @author aneen
 */
public class scanner{ 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in); 
     //   Scanner input=new Scanner(System.in);// This is another object of scanner class
     System.out.println("Enter any value for radius:");
     double radius=sc.nextDouble();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("Area of circle:"+area);
        
    }
    }

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    
    

