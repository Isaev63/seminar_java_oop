package homework;

public class Main {
    public static void main(String[] args) {
        Saver userSaver = new UserSaver();
        User user = new User("Bob", userSaver);
        user.report();
        user.save();
    }
}