package JavaCollections.SigortaYönetimSistemi;

public class CarInsurance extends Insurience {
    CarInsurance(){
        super();
    }
    public double calculateInsuranceCost() {
        return insurienceCost * 2.5;
    }
}
