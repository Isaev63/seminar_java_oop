package main.clients;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimable {
    public Dolphin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dolphin() {
        super();
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " ходить не умеет, у него плавники!!!");
    }

    @Override
    public void toFly() {
        System.out.println(getType() + " летать не может!!!");
    }

    @Override
    public void eat() {
        System.out.println("Дельфин ест!");
    }

    @Override
    public double swim() {
        System.out.println(getType() + " плывет!");
        return 12.5;
    }
}
