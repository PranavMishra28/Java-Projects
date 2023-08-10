/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.customerloanaccount;

/**
 *
 * @author Pranav Mishra
 */
//Derived from Loan Account using inheritance
public class UnsecuredLoan extends LoanAccount {

//    Constructor
    public UnsecuredLoan(double principal, double annualInterestRate, int months) {
        super(principal, annualInterestRate, months);
    }
//    toString() Method
    @Override
    public String toString(){
        return "\nUnsecured Loan with:\n"+ super.toString();
    } 
}
