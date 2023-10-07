import java.util.*;

public class AccountManager {
    private boolean isContinue = true;
    User user;
    Insurance insurance;
    public User getUser() {
        return user;
    }
    public ArrayList<Insurance> insuranceArrayList = new ArrayList<>();

    public void addInsurance(Insurance insurance){
        insuranceArrayList.add(insurance);
    }



    public TreeSet<Account> accountTreeSet = new TreeSet<>();

    Scanner input = new Scanner(System.in);


    public void addForTree(Account individual){
        accountTreeSet.add(individual);

    }




    public void login() {
        System.out.println("Sigorta Şirketine Hoşgeldiniz ");


        System.out.println("Please enter your information  ");
        System.out.print("Name : ");
        String name = input.nextLine();
        System.out.print("Surname : ");
        String surName = input.nextLine();
        System.out.print("Email : ");
        String email = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();
        System.out.print("Occupation : ");
        String occupation = input.nextLine();
        System.out.print("Address : ");
        String address = input.nextLine();


        //how to handle this problem look at the below code source

        /*
        User individualUser = new User();
        Account individualAccount = new IndividualAccount(individualUser);

        User enterpriseUser = new User( enterprise user details );
        Account enterpriseAccount = new EnterpriseAccount(enterpriseUser);


        */

        User individualUser = new User(name, surName, email, password, occupation, address);
        Account individualAccount = new Individual(individualUser);
        AddressManager.addAddress(individualUser, address);
        individualAccount.showUserInfo();


        addForTree(individualAccount);


/// deneme yeri

     /*   User individualUser1 = new User("harun", surName, email, password, occupation, address);
        Account individualAccount1 = new Individual(individualUser1);
        AddressManager.addAddress(individualUser, address);
        individualAccount1.showUserInfo();
        addForTree(individualAccount1);


      */
        //deneme



       // System.out.println(accountTreeSet.first().getUser().getName());
        System.out.println();
        // ArrayList arrayList = new ArrayList<User>();
        //  arrayList.add(individualAccount);
        // System.out.println(individualAccount.getUser().getName());  kullanılabilir .


        //  AddressManager.removeAddress(individualUser,address);

        System.out.println("Kayıt Başarılı Bir şekilde Olundu");


        Individual individual = new Individual(individualUser);




        while (isContinue) {
            System.out.println("Emaili lütfen giriniz : ");
            String completedEmail = input.nextLine();
            System.out.print("Şifreyi giriniz :");

            String completedPassword = input.nextLine();
            AuthenticationStatus status = individual.login(completedEmail, completedPassword);
            switch (status) {
                case SUCCESS:
                    System.out.println("Login successful!");
                    isContinue = false;

                    break;
                case FAIL:

                    Exception a = new Exception("InvalidAuthenticationException");

                    System.out.println(a);
                    break;

                default:
                    System.out.println("Unknown authentication status.");

            }


        }


    /*    System.out.println("Yeni fonksiyonun tanımlandığı yerler !!");
        System.out.println("Adres eklemek için  <E>  tuşuna  Kaldırmak için <K> basınız !!!:");

        String buttonForAddress = input.nextLine().toLowerCase();

        if (buttonForAddress.equals("e") || buttonForAddress.equals("k")) {
            if (buttonForAddress.equals("e")) {
                System.out.println("Yeni adresi giriniz :  ");
                String newAddress = input.nextLine();
                AddressManager.addAddress(individualUser, newAddress);


            } else {
                System.out.println("Kaldırmak istediğiniz adresin indis numarasını giriniz : ");

                AddressManager.removeAddress(individualUser, individualUser.getAddressList().remove(0));

            }

        }


     */
        System.out.println("<<<Hoşgeldiniz>>>  " + individualUser.getName() + "\tBey" + "\tLütfen Yaptırmak İstediğiniz Sigortayı Seçiniz !");
        int choice =input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Heathy insurance : ");
            case 2:
                System.out.println("ResidenceInsurance (konut sigortası)");
            case 3:
                System.out.println("TravelInsurance (seyahat sigortası)");
            case 4:
                getInsurance();
                System.out.println("CarInsurance  (otomobil sigortası)");

        }



        individualAccount.showUserInfo();








    }
    public void getInsurance(){
        java.util.Date date = new java.util.Date();

        Insurance insurance = new CarInsurance("xx",12,date);

    //    accountTreeSet.first().getInsuranceList().add(insurance);
        accountTreeSet.first().addInsurance(insurance);
        // ikisi de oluyor
        for (int i = 0; i <accountTreeSet.size() ; i++) {
            System.out.println(accountTreeSet.first().getInsuranceList().get(i).getInsuranceName() + "\t"+accountTreeSet.first().getInsuranceList().get(i).getInsuranceCost() + insurance.getDate()  + "\t\ttarihinde alındı"
            );
        }

    }

}
