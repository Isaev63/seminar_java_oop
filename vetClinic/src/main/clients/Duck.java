package main.clients;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Flyable {
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Утка ест!");
    }


    @Override
    public double fly() {
        System.out.println(getType() + " летит!");
        return 50;
    }

    @Override
    public double run() {
        System.out.println(getType() + " бежит!");
        return 3;
    }

    @Override
    public double swim() {
        System.out.println(getType() + " плывет!");
        return 5;
    }
}
