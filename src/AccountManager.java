import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager{
    private boolean isContinue = true;
        User user;
     ArrayList arrayList = new ArrayList<>();

    TreeSet<Individual> individualTreeSet = new TreeSet<>();
    TreeSet <Enterprise> enterpriseTreeSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);


    public void add(User user){
        arrayList.add(user);


    }

    public void start(){
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

        User individualUser = new User(name,surName,email,password,occupation, address);
        Account individualAccount = new Individual(individualUser);
        AddressManager.addAddress(individualUser,address);
        individualAccount.showUserInfo();





      //  AddressManager.removeAddress(individualUser,address);

        System.out.println("Kayıt Başarılı Bir şekilde Olundu");



        Individual individual = new Individual(individualUser);







        while (isContinue){
            System.out.println("Emaili lütfen giriniz : ");
            String completedEmail = input.nextLine();
            System.out.print("Şifreyi giriniz :");

            String completedPassword = input.nextLine();
            AuthenticationStatus status = individual.login(completedEmail,completedPassword);
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


        System.out.println("Yeni fonksiyonun tanımlandığı yerler !!");








        // String passwordAgain = input.nextLine();
   //     individualUser.loginStatus(passwordAgain); burası çıkartabiliyor






    //boolean lı bir sürekli dönen bir şey yap


       // ArrayList arrayList = new ArrayList<User>();
      //  arrayList.add(individualAccount);
       // System.out.println(individualAccount.getUser().getName());  kullanılabilir .






    }

}
