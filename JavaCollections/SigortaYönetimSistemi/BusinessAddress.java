package JavaCollections.SigortaYönetimSistemi;
public class BusinessAddress extends Address{
    BusinessAddress(String street, String city, String postalCode){
        super();
    }
    @Override
    public String getAddress() {
        return "Business Address: " + street + ", " + city + ", " + postalCode;
    }
}
