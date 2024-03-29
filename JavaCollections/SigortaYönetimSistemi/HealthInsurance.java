package JavaCollections.SigortaYönetimSistemi;
import java.util.Date;
public class HealthInsurance extends Insurience{
    HealthInsurance(String name,double insurienceCost,Date insurienceStartDate,Date insurienceFinishDate){
        super();
    }
    @Override
    public double calculateInsuranceCost() {
        double ageFactor = 25 *1.15;

        return insurienceCost * ageFactor;
    }
}
