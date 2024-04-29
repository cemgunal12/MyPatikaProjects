package JavaCollections.SigortaYönetimSistemi;
import java.util.Date;
public class HealthInsurance implements Insurance{
    String name;
    double insuranceCost;
    String type;
    Date insurienceStartDate;
    Date insurienceFinishDate;
    

    public HealthInsurance(String name, double insuranceCost, Date insurienceStartDate,
        Date insurienceFinishDate) {
        this.name = name;
        this.insuranceCost = insuranceCost;
        this.type = "Health";
        this.insurienceStartDate = insurienceStartDate;
        this.insurienceFinishDate = insurienceFinishDate;
    }
    public String getInsuranceInfo() {
        return name + ", Price: " + insuranceCost + ", Start Date: " + insurienceStartDate + ", End Date: " + insurienceFinishDate;
    }
    @Override
    public double calculateInsuranceCost() {
        double ageFactor = 25 *1.15;

        return insuranceCost * ageFactor;
    }
}
