package builder;


public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder("Pawel", "Noga").age(10).phone(1231243).gender("Male").build();

    }
}
