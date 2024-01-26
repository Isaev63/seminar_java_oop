package main.clients;

import java.time.LocalDate;

public class Eagle extends Animal {
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
}
