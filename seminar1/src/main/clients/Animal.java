package main.clients;

import java.time.LocalDate;

public class Animal {
    // Protected constructor видно в классе и в его наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    // Конструктор
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болезнь"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle() {
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    private void wakeUp() {
        System.out.println(getType() + " просыпается!");
    }

    private void wakeUp(String time) {
        System.out.println(getType() + " просыпается в " + time);
    }

    private void hunt() {
        System.out.println(getType() + " охотится!");
    }

    private void eat() {
        System.out.println(getType() + " ест.");
    }

    private void sleep() {
        System.out.println(getType() + " спит.");
    }

    public void toGo() {
        System.out.println(getType() + " двигается!");
    }

    public void toFly() {
        System.out.println(getType() + " летит!");
    }

    public void toSwim() {
        System.out.println(getType() + " плывет!");
    }

    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}
