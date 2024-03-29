package JavaCollections.SigortaYönetimSistemi;

public class TravelInsurance extends Insurience {
    TravelInsurance(){
        super();
    }
    @Override
    public double calculateInsuranceCost() {
        return insurienceCost * 3.5;
    }
}
