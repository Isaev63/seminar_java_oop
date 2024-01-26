package main.clients;

import java.time.LocalDate;

public class Cat extends Animal {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
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
}
