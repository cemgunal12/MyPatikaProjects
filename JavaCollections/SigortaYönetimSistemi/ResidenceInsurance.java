package JavaCollections.SigortaYönetimSistemi;

import java.util.Date;

public class ResidenceInsurance implements Insurance{
    String name;
    double insuranceCost;
    String type;
    Date insurienceStartDate;
    Date insurienceFinishDate;
    

    public ResidenceInsurance(String name, double insuranceCost, Date insurienceStartDate,
        Date insurienceFinishDate) {
        this.name = name;
        this.insuranceCost = insuranceCost;
        this.type = "Travel";
        this.insurienceStartDate = insurienceStartDate;
        this.insurienceFinishDate = insurienceFinishDate;
    }
    public String getInsuranceInfo() {
        return name + ", Price: " + insuranceCost + ", Start Date: " + insurienceStartDate + ", End Date: " + insurienceFinishDate;
    }
    @Override
    public double calculateInsuranceCost() {
        return insuranceCost * 3.5;
    }
}
