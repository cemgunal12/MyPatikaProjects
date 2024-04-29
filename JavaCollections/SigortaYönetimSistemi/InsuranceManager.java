package JavaCollections.SigortaYönetimSistemi;

public class InsuranceManager {
    public static void addInsurance(User user, Insurance insurance) {
        user.getInsurance().add(insurance);
    }

    public static void removeInsurance(User user, Insurance insurance) {
        user.getInsurance().remove(insurance);
    }
}
