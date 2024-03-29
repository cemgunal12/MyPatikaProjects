package JavaCollections.SigortaYönetimSistemi;

public class ResidenceInsurance extends Insurience{
    ResidenceInsurance(){
        super();
    }
    @Override
    public double calculateInsuranceCost() {
        return insurienceCost * 0.5;
    }
}
