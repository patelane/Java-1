/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author aneen
 */
public class account {
    private int id=0;
    private double balance=0.0;
    private double annualInterestRate=0.0;
    public account()//no argument constructor
    {
        id=23;
        balance=1000;
        annualInterestRate=2;
    }
    public account(int id,double balance,double annualInterestRate)//argument constructor
    {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBal()
    {
        this.balance=balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public double getMonthlyInterestRate()
    {
        return (getAnnualInterestRate()/100)/12;
    }
    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }
    public double withdraw(double w)
    {
        return balance=balance-w;
    }
    public double deposit(double d)
    {
        return balance=balance+d;
    }
    
}
