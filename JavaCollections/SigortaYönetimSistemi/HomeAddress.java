package JavaCollections.SigortaYönetimSistemi;

public class HomeAddress extends Address {
    public HomeAddress(String street, String city, String postalCode){
        super();
    }
    @Override
    public String getAddress() {
        return "Home Address: " + street + ", " + city + ", " + postalCode;
    }
}
