import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable <Account>{
    private  User user;
    private Insurance insurance;
    private AuthenticationStatus authenticationStatus;

    private ArrayList<String> insurances;
    ArrayList <Insurance> insuranceList = new ArrayList<>();

    public void addInsurance(Insurance insurance){
        this.insurance = insurance;

        insuranceList.add(insurance);

    }public abstract AuthenticationStatus login(String username, String password) ;

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    } public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsurances(ArrayList<String> insurances) {
        this.insurances = insurances;
    }






    public  User getUser() {

        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public Account(User user) {
        authenticationStatus = AuthenticationStatus.FAIL;
        insurances = new ArrayList<>();
        this.user = user;
    }
    public int compareTo(User obj){
        return this.getUser().getName().compareTo(obj.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user) && Objects.equals(insurance, account.insurance) && authenticationStatus == account.authenticationStatus && Objects.equals(insurances, account.insurances) && Objects.equals(insuranceList, account.insuranceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    public  final void showUserInfo(){



        System.out.println("<<<<<<<<<<<<Customer Information >>>>>>>");
        System.out.println("First name : "+getUser().getName());
        System.out.println("Surname : " + getUser().getSurName());
        System.out.println("Email : " + getUser().getEmail());
        System.out.println("Occupation : " + getUser().getOccupation());


        try {
            for (int i = 0; i <getUser().getAddressList().size() ; i++) {
                System.out.println("Address : " + getUser().getAddressList().get(i));

            }


        }catch (IndexOutOfBoundsException  e){
            System.out.println("Address : Bilinmemektedir. " );
        }








    }


}
