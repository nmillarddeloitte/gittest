import mypackages.User;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        User u = new User("Nick", 20);

        System.out.println(u.getAge());

        u.setUsername("nmill");

        System.out.println(u);

    }
}
