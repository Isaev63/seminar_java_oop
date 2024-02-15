package homework;

public class UserSaver implements Saver {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}