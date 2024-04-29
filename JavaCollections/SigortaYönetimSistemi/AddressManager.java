package JavaCollections.SigortaYönetimSistemi;

public class AddressManager {
    public static void addAddress(User user, Address address) {
        user.getAddress().add(address);
    }

    public static void removeAddress(User user, Address address) {
        user.getAddress().remove(address);
    }
}
