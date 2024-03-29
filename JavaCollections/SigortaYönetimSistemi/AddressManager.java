package JavaCollections.SigortaYönetimSistemi;

public class AddressManager {
    static void addHomeAddress(User user, String street, String city, String postalCode) {
        user.getAddress().add(new HomeAddress(street, city, postalCode));
    }

    static void addBusinessAddress(User user, String street, String city, String postalCode) {
        user.getAddress().add(new BusinessAddress(street, city, postalCode));
    }
    public static void removeAddress(User user, Address address) {
        user.getAddress().remove(address);
    }
}
