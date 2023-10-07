import java.util.Date;

public class HealthInsurance extends Insurance{

    public HealthInsurance(String insuranceName, int insuranceCost, Date date) {
        super(insuranceName, insuranceCost, date);
    }

    @Override
    public void calculate() {

    }
}
