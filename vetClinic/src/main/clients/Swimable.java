package main.clients;

public interface Swimable {
    default double swim() {
        return 3;
    }
}
