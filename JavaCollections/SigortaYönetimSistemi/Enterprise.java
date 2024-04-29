package JavaCollections.SigortaYönetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class Enterprise extends Account {
    public Enterprise(User user) {
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    @Override
    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
            user.setlastLoginDate(new Date());
        } else {
            authenticationStatus = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid email or password!");
        }
    }

    @Override
    public void addAddress(Address address) {
        user.getAddress().add(address);
    }

    @Override
    public void removeAddress(Address address) {
        user.getAddress().remove(address);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }
    @Override
    public void removeInsurance(Insurance insurance){
        user.getInsurance().remove(insurance);
    }
}

