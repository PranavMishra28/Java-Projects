/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.customerloanaccount; 
/**
 *
 * @author Pranav Mishra
 */
public class LoanAccount {
    private final double principal;
    private final double annualInterestRate;
    private final int months;

    public double calculateMonthlyPayment(){
        double monthlyInterest = annualInterestRate/1200;
        double monthlyPayment = principal * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -months)));
        return monthlyPayment;
}
//    Constructor
    public LoanAccount(double principal, double annualInterestRate, int months) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
    }

//    Getter Methods
    public double getPrincipal() {
        return principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getMonths() {
        return months;
    }

//    toString() Method
    @Override
    public String toString() {
        return "Principle: $" + String.format("%.2f", getPrincipal()) + "\nAnnual Interest Rate: " + String.format("%.2f", getAnnualInterestRate()) +"%" + "\nTerm of Loan in Months: " + getMonths()+"\nMonthly Payment: $"+ String.format("%.2f",calculateMonthlyPayment())+"\n";
    }
  
    
    
    }
    
    
