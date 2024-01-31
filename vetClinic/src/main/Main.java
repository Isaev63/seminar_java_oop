package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal cat = new Cat("Барсик",
//                new Owner("Иванов Иван Иванович"),
//                LocalDate.of(2021, 10, 05),
//                new Illness("Лишай"), 8D);  // Создаём экземпляр класса

//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickName());
//        cat.setIllness(new Illness(null));
//        System.out.println(cat.getIllness());

//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNickName());
//
//        cat.lifeCycle();

//        System.out.println(cat.getType());
//        System.out.println(cat);
//
//        Animal cat1 = new Cat();
//        Dog dog1 = new Dog();
//        System.out.println(cat1.getType());
//        System.out.println(dog1.getType());
//        System.out.println(cat1);
//
//        List<Animal> animals = new ArrayList<Animal>();
//        animals.add(cat1);
//        animals.add(dog1);
//        animals.add(cat);
//
//        int i = 0;
//        for (Animal animal : animals) {
//            System.out.println(i + " " + animal);
//            i++;
//        }

        Cat cat_white = new Cat();
        Dog dog_black = new Dog();
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();
        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();
//
//        cat_white.toGo();
//        cat_white.toFly();
//        cat_white.toSwim();
//        System.out.println("--------------------------------");
//        dog_black.toGo();
//        dog_black.toFly();
//        dog_black.toSwim();
//        System.out.println("--------------------------------");
//        penguin.toGo();
//        penguin.toFly();
//        penguin.toSwim();
//        System.out.println("--------------------------------");
//        eagle.toGo();
//        eagle.toFly();
//        eagle.toSwim();
//        System.out.println("--------------------------------");
//        dolphin.toGo();
//        dolphin.toFly();
//        dolphin.toSwim();
//        System.out.println("--------------------------------");
//        duck.toGo();
//        duck.toFly();
//        duck.toSwim();

//        List<Goable> list = new ArrayList<>();
//        Cat cat3 = new Cat();
//        Dog dog3 = new Dog();
//        list.add(cat3);
//        list.add(dog3);
//        System.out.println(list);

        System.out.println("Скорость: " + cat_white.run());
        System.out.println("Скорость: " + cat_white.swim());
        System.out.println("--------------------------------");
        System.out.println("Скорость: " + dog_black.run());
        System.out.println("Скорость: " + dog_black.swim());
        System.out.println("--------------------------------");
        System.out.println("Скорость: " + penguin.run());
        System.out.println("Скорость: " + penguin.swim());
        System.out.println("--------------------------------");
        System.out.println("Скорость: " + eagle.run());
        System.out.println("Скорость: " + eagle.fly());
        System.out.println("--------------------------------");
        System.out.println("Скорость: " + dolphin.swim());
        System.out.println("--------------------------------");
        System.out.println("Скорость: " + duck.run());
        System.out.println("Скорость: " + duck.swim());
        System.out.println("Скорость: " + duck.fly());
        System.out.println("--------------------------------");

        VeterinaryClinic vetClinic = new VeterinaryClinic();
        vetClinic.addPatient(cat_white);
        vetClinic.addPatient(dog_black);
        vetClinic.addPatient(dolphin);
        vetClinic.addPatient(duck);
        vetClinic.addPatient(penguin);
        vetClinic.addPatient(eagle);

        System.out.println(vetClinic.getPatients());
        System.out.println(vetClinic.getFlyable());
        System.out.println(vetClinic.getGoables());
        System.out.println(vetClinic.getSwimable());
        System.out.println("--------------------------------");

        Doctor doc = new Doctor("Владимир", "Хирург", 26);
        Doctor doc1 = new Doctor("Иван", "Ортопед", 15);
        vetClinic.addDoctor(doc);
        vetClinic.addDoctor(doc1);
        System.out.println(vetClinic.getAllDoctors());
        System.out.println("--------------------------------");

        Nurse nur = new Nurse("Алла", "Медсестра", 5);
        vetClinic.addNurse(nur);
        System.out.println(vetClinic.getAllDoctors());
    }
}
