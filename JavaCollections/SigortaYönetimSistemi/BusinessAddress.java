package JavaCollections.SigortaYönetimSistemi;
public class BusinessAddress implements Address{
    private String street;
    private String city;
    private int postalCode;

    public BusinessAddress(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddressInfo() {
        return street + ", " + city + ", " + postalCode;
    }
}
