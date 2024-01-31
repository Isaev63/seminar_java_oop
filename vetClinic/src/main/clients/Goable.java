package main.clients;

public interface Goable {
    default double run() {
        return 0;
    }
}
