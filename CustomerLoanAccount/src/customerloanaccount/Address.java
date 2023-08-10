/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.customerloanaccount;

/**
 *
 * @author Pranav Mishra
 */
public class Address {

    private String street;
    private String city;
    private String State;
    private String zipcode;

//    Constructor
    public Address(String street, String city, String State, String zipcode) {
        this.street = street;
        this.city = city;
        this.State = State;
        this.zipcode = zipcode;
    }
//    Getter Methods
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return State;
    }

    public String getZipcode() {
        return zipcode;
    }
    
//    toString() Method
    @Override
    public String toString(){
        return "Property Address:\n  "+getStreet()+"\n  "+getCity()+", "+getState()+" "+getZipcode()+"\n";
    }
    
    
    
}
