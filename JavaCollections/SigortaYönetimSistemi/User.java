package JavaCollections.SigortaYönetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {
    String name;
    String surname;
    String email;
    String password;
    String job;
    int age;
    ArrayList<Address>addressList=new ArrayList<>();
    Date lastLoginDate;
    ArrayList<Insurance>insuranceList=new ArrayList<>();

    public User(String name, String surname, String email, String password, String job, int age,
    Date lastLoginDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList = new ArrayList<>();
        this.insuranceList=new ArrayList<>();
        this.lastLoginDate = lastLoginDate;

    }
    public void displayAddresses() {
        System.out.println("Addresses of " + name + ":");
        for (Address address : addressList) {
            System.out.println(address.getAddressInfo());
        }
    }
    public void displayInsurances() {
        System.out.println("Insurances of " + name + ":");
        for (Insurance insurance : insuranceList) {
            System.out.println(insurance.getInsuranceInfo());
        }
    }
    public ArrayList<Address> getAddress() {
        return addressList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public ArrayList<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }
    public Date getlastLoginDate() {
        return lastLoginDate;
    }
    public void setlastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    public Date getLastLoginDate() {
        return lastLoginDate;
    }
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    public ArrayList<Insurance> getInsurance() {
        return insuranceList;
    }
    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }
    public void setInsurance(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
    
}
