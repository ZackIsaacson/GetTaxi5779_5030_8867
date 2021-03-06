package com.gettaxi.benzack.gettaxi5779_5030_8867.model.entities;

import android.location.Location;

import java.sql.Time;

public class Client{
    String clientName;
    double clientPhoneNumber;
    String clientEmailAddress;

    public Client(String clientName, double clientPhoneNumber, String clientEmailAddress) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientEmailAddress = clientEmailAddress;
    }

public String PhoneNumberToString()
{
    double p=getClientPhoneNumber();
    return " " + p + " ";
}
    //setters
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientPhoneNumber(double clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public void setClientEmailAddress(String clientEmailAddress) {
        this.clientEmailAddress = clientEmailAddress;
    }
//getters
    public String getClientName() {
        return clientName;
    }

    public double getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientPhoneNumber=" + clientPhoneNumber +
                ", clientEmailAddress='" + clientEmailAddress + '\'' +
                '}';
    }

    //constructors
}
