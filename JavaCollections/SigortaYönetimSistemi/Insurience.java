package JavaCollections.SigortaYönetimSistemi;
import java.util.Date;
public abstract class Insurience {
    String name;
    double insurienceCost;
    Date insurienceStartDate;
    Date insurienceFinishDate;

    abstract double calculateInsuranceCost();
}
