/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.customerloanaccount;

import java.util.ArrayList;

/**
 *
 * @author Pranav Mishra
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts = new ArrayList<>();
    
//    Constructor
    public Customer(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
//    Getter Methods
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getSSN(){
        return SSN;
    }
    
    public void addLoanAccount(LoanAccount account){
        loanAccounts.add(account);
    }
    
    public String printMonthlyReport(){
        String report = String.format("Account Report for Customer: " + getfirstName() + " " + getlastName() + " with SSN " + getSSN() + "\n\n");
         for (LoanAccount account: loanAccounts)
        {
            report += account.toString();
        }
         return report;
    }
}

