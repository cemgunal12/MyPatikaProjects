package JavaCollections.SigortaYönetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {
    String name;
    String surName;
    String email;
    String password;
    String job;
    int age;
    ArrayList<Address>addressList=new ArrayList<>();
    Date date;

    public User(String name, String surName, String email, String password, String job, int age,
        ArrayList<Address> adressList, Date date) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList = new ArrayList<>();
        this.date = date;
    }
    public void displayAddresses() {
        System.out.println("Addresses of " + name + ":");
        for (Address address : addressList) {
            System.out.println(address.getAddress());
        }
    }
    public ArrayList<Address> getAddress() {
        return addressList;
    }
}
