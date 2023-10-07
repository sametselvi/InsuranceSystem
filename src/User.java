import java.util.*;

public class User{
    private Insurance insurance;
    private String name;
    private String surName;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private ArrayList <String> addressList = new ArrayList<>();
    private ArrayList <Insurance> İNSURANCELİST = new ArrayList<>();



    private Date lastSeen;
    private String address;
    private boolean loginStatus = false;



    public boolean isLoginStatus() {
        return loginStatus;
    }

    public boolean loginStatus(String password){
        if(getPassword().equals(password)){

            loginStatus= true;
            return true;


        }else {

            loginStatus= false;
            return false;
        }
    }

    public String getAddress() {
        return address;
    }

    static Scanner input = new Scanner(System.in);
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<String> addressList) {
        this.addressList = addressList;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }


    public User(String name, String surName, String email, String password, String occupation,String address  ) {

        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        this.addressList = addressList;
        this.lastSeen = lastSeen;
        this.address = address;
    }
    public void addInsurance(Insurance insurance){

        this.insurance = insurance;
        İNSURANCELİST.add(insurance);

    }








}
