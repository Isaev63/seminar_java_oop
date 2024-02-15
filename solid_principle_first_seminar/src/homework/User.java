package homework;

public class User {
    private final String name;
    private final Saver userSaver;

    public User(String name, Saver userSaver) {
        this.name = name;
        this.userSaver = userSaver;
    }

    public String getName() {
        return name;
    }

    public void save() {
        userSaver.save(this);
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }
}