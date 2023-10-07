import javax.naming.NamingException;

public class Individual extends Account {


    @Override
    public AuthenticationStatus login(String enteredEmail, String enteredPassword)
    {



        if(enteredEmail.equals(getUser().getEmail()) && enteredPassword.equals(getUser().getPassword())){

            return AuthenticationStatus.SUCCESS;
        }






        return AuthenticationStatus.FAIL;
    }


    public Individual(User user) {
        super(user);
    }


    @Override
    public int compareTo(Account o) {
        return 0;
    }
}

