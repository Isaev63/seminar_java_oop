package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); // todo: сначала конструктор супер-класса
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Discount = " + discount;
    }

    @Override
    public void toFly() {
        System.out.println(getType() + " летать не может!!!");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " ест!");
    }

    @Override
    public double run() {
        System.out.println(getType() + " бежит!");
        return 15;
    }

    @Override
    public double swim() {
        System.out.println(getType() + " плывет!");
        return 2.5;
    }
}