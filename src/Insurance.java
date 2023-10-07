import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Insurance {
    private String insuranceName;
    private int insuranceCost;
    private Date date;

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    private List<Insurance> insuranceList;


    public String getInsuranceName() {
        return insuranceName;
    }

    public int getInsuranceCost() {
        return insuranceCost;
    }

    public Date getDate() {
        return date;
    }
    public void addInsurance(Insurance insurance){
        insuranceList.add(insurance);
    }

    public abstract void calculate();

    public Insurance(String insuranceName, int insuranceCost, Date date) {
        this.insuranceList = new ArrayList<>();
        this.insuranceName = insuranceName;
        this.insuranceCost = insuranceCost;
        this.date = date;
    }





}
