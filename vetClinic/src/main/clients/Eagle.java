package main.clients;

import java.time.LocalDate;

public class Eagle extends Animal implements Goable, Flyable {
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Eagle() {
        super();
    }

    @Override
    public void toSwim() {
        System.out.println(getType() + " плавать не умеет!!!");
    }

    @Override
    public void eat() {
        System.out.println("Орел ест!");
    }

    @Override
    public double fly() {
        System.out.println(getType() + " летит!");
        return 90;
    }

    @Override
    public double run() {
        System.out.println(getType() + " бежит!");
        return 2.5;
    }
}
