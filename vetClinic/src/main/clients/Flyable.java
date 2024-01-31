package main.clients;

public interface Flyable {
    default double fly() {
        return 35;
    }
}
