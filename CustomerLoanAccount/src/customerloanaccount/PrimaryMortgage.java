/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.customerloanaccount;

/**
 *
 * @author Pranav Mishra
 */
public class PrimaryMortgage extends LoanAccount{

    private double PMIMonthlyAmount;
    private Address address;

//    Constructor
    public PrimaryMortgage(double principal, double annualInterestRate, int months,double PMIMonthlyAmount, Address address) {
        super(principal, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }
//     toString() Method
        @Override
    public String toString(){
        return "Primary Mortgage Loan with:\n" + super.toString() + "Primary Monthly Amount: $" + PMIMonthlyAmount + "\n" + address.toString();
    }
    
    
}
