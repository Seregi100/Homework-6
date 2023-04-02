/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework6;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author Seregi
 */
public class Car implements Externalizable{
    private String brand;
    private int releaseYear;
    private String regNumber;
    private double fuelCapasity;
    private double mileage;

    public Car(String brand, int releaseYear, String regNumber, double fuelCapasity, double mileage) {
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.regNumber = regNumber;
        this.fuelCapasity = fuelCapasity;
        this.mileage = mileage;
    }

    public Car() {
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(this.brand);
        out.writeObject(this.releaseYear);
        out.writeObject(this.regNumber);
        out.writeObject(this.fuelCapasity);
        out.writeObject(this.mileage);
    }
    
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        this.brand = (String)in.readObject();
        this.releaseYear = (Integer)in.readObject();
        this.regNumber = (String)in.readObject();
        this.fuelCapasity = (Float)in.readObject();
        this.mileage = (Float)in.readObject();
    }
}
