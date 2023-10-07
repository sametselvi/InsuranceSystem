public class Enterprise extends Account {

    @Override
    public AuthenticationStatus login(String username, String password) {

        return null;
    }

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }
}
