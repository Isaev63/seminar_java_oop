package main.clients;

import java.time.LocalDate;

public class Penguin extends Animal implements Goable, Swimable {
    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Penguin() {
        super();
    }

    @Override
    public void toFly() {
        System.out.println(getType() + " хоть это и птица, но тоже летать не может!!!");
    }

    @Override
    public void eat() {
        System.out.println("Пингвин ест!");
    }

    @Override
    public double run() {
        System.out.println(getType() + " бежит!");
        return 2.5;
    }

    @Override
    public double swim() {
        System.out.println(getType() + " плывет!");
        return 12.5;
    }
}
