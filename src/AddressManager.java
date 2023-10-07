import java.util.List;

public class AddressManager{

        private User user;





         public  static  void addAddress( User user, String address){


             if (user != null) {
                 List<String> addresses = user.getAddressList();
                 addresses.add(address);
             } else {
                 throw new IllegalArgumentException("Geçerli bir kullanıcı nesnesi belirtilmelidir.");
             }
         }
         public static void removeAddress(User user , String address){


                 user.getAddressList().remove(address);



         }

}
