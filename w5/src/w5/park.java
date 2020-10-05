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
public class park {
    public static void main(String[] args){
//        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter miles driven per day:");
        double miles=input.nextDouble();
        System.out.println("Enter cost per gallon:");
        double cost=input.nextDouble();
        System.out.println("Enter average miles per day:");
        double avg=input.nextDouble();
        System.out.println("Enter parking fees:");
        double fees=input.nextDouble();
        System.out.println("Enter tolls per day:");
        double tolls=input.nextDouble();
       double totalcost=miles/avg*cost+fees+tolls;
        System.out.println("Total cost is:"+totalcost);

char x = 'a';
char y = 'c';  
System.out.println(++x);  
System.out.println(y++);   
System.out.println(x - y); 

String message="1";
String j="2";
System.out.println("i+j:"+message+j);


String name="developer";
double dblLevel = 1;
System.out.println("Hello"+name+"You are now in level"+dblLevel);

      char c='A';
    int i=(int)c;
   System.out.println("c="+c+"\ni="+i);
    
    float f=1000.33f;
    int k1=(int)f;
    System.out.println("f="+f+"i="+k1);
    
    double result=6.2+2*(16%3)+3/2;
    System.out.println("result="+result);
    
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter name:");
    String nme=inp.nextLine();
    System.out.println("name:"+nme);
    
   // Scanner input=new Scanner(System.in);
    int k=2;
    System.out.println("Your doubled number:"+k*2);
    System.out.println("Your number:"+k);
    
    
   System.out.println((int)(Math.random()));
   System.out.printf("%5d\n",34%7);
   System.out.printf("%04d\n",3 + 4 * 2 / 2 * 9);
   int n=4;
   System.out.printf("n=%d\n",3*n);
   int x1=943;
   System.out.printf("x=%d\n",x1%100);
   int y1=-2;
   y1++;
   System.out.println(y1);
   

//Scanner input=new Scanner(System.in);
System.out.println("Enter sec:");
long sec=input.nextLong();
long remsec=(sec%60);
long min=(sec/60);
long remmin=min%60;
long hours=(min/60);
System.out.println(hours+":"+remmin+":"+remsec);


//Scanner input=new Scanner(System.in);
long totms=System.currentTimeMillis();
long totsec=totms/1000;
long cursec=totsec%60;
long totmin=totsec/60;
long curmin=totmin%60;
long tothr=totmin/60;
long curhr=tothr%28;
System.out.println("Current time is="+curhr+":"+curmin+":"+cursec);

//Scanner input=new Scanner(System.in);
System.out.println("Enter amout:");
double amt=input.nextDouble();
int ramt=(int)(amt*100);
int dollars=ramt/100;
ramt=ramt%100;
int quarters=ramt/25;
ramt=ramt%25;
int dimes=ramt/10;
ramt=ramt%10;
int nickels=ramt/5;
ramt=ramt%5;
int pennies=ramt;
System.out.println(dollars+"dollars"+quarters+"quarters"+dimes+"dimes"+nickels+"nickels"+pennies+"pennies");

    }
    
}
