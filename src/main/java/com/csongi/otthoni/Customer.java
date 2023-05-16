package com.csongi.otthoni;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    
    public Customer(int id, String firstName, String lastName, String address, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
    public String getError() {
        if( (firstName.length() < 2) || (lastName.length() < 2)) {
            return "nem megfelelő név";
        }if(address.length() < 2) {
            return "nem megfelelő cím";
        }
        return null;
    }

    public int getAge() {
        return age;
    }
    

}
