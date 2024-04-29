package JavaCollections.SigortaYönetimSistemi;
import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    protected enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    protected AuthenticationStatus authenticationStatus;
    protected User user;
    protected ArrayList<Insurance> insurances;

    public abstract void login(String email, String password) throws InvalidAuthenticationException;

    public abstract void addAddress(Address address);

    public abstract void removeAddress(Address address);

    public abstract void addInsurance(Insurance insurance);

    public abstract void removeInsurance(Insurance insurance);

    public void showUserInfo() {
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
        System.out.println("Last Login Date: " + user.getlastLoginDate());
        System.out.println("Job: "+user.getJob());
        System.out.println("Addresses:");
        for (Address address : user.getAddress()) {
            System.out.println(address.getAddressInfo());
        }
        System.out.println("Insurances:");
        for (Insurance insurance : insurances) {
            System.out.println(insurance.getInsuranceInfo());
        }
    }

    @Override
    public int compareTo(Account other) {
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        return user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return user.getEmail().equals(account.user.getEmail());
    }
}
