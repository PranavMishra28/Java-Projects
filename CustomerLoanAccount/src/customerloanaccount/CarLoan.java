/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.customerloanaccount;

/**
 *
 * @author Pranav Mishra
 */
public class CarLoan extends LoanAccount{
    private String vehicleVIN;

//    Constructor
    public CarLoan(double principal, double annualInterestRate, int months, String vehicleVIN) {
        super(principal, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }
//    toString() Method
    @Override
    public String toString(){
        super.toString();
        return "Car Loan with: \n"+super.toString()+"Vehicle VIN: " + vehicleVIN +"\n\n";
    }
    
    
    
}
