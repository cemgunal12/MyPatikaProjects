package JavaCollections.SigortaYönetimSistemi;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Örnek bir kullanıcı oluşturuluyor
        User user = new User("John", "Doe", "john@example.com", "password", "Engineer", 30,null);
        user.getAddress().add(new HomeAddress("123 Street", "City", 34020));
        user.getInsurance().add(new CarInsurance("Car Insurance",100,new Date(),new Date()));
        // Individual hesap oluşturuluyor
        Account individualAccount = new Individual(user);

        try {
            // Kullanıcı girişi yapılıyor
            individualAccount.login("john@example.com", "password");
            System.out.println("Login successful!");

            // Kullanıcının bilgileri gösteriliyor
            individualAccount.showUserInfo();

            // Adres ekleniyor
            individualAccount.addAddress(new HomeAddress("456 Avenue", "Town", 34050));
            System.out.println("Address added!");
            user.displayAddresses();

            // Sigorta oluşturuluyor
            individualAccount.addInsurance(new HealthInsurance("Health Insurance", 100.0, new Date(), new Date()));
            System.out.println("Insurance added!");
            user.displayInsurances();

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }
}

