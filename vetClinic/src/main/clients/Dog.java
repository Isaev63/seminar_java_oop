package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void toFly() {
        System.out.println(getType() + " летать не может!!!");
    }

    @Override
    public void eat() {
        System.out.println("Пес ест!");
    }

    @Override
    public double run() {
        System.out.println(getType() + " бежит!");
        return 11.5;
    }

    @Override
    public double swim() {
        System.out.println(getType() + " плывет!");
        return 3;
    }
}
