package main.drugstore;

import main.drugstore.components.Water;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Water("Azitronite", 1D, 14);
        Component penicillin = new Water("Penicillin", 2D, 6);
//
//        Pharmacy2 p1 = new Pharmacy2();
//        p1.addComponents(water, azitronite);
//        Pharmacy2 p2 = new Pharmacy2();
//        p2.addComponents(water, penicillin);
//        Pharmacy2 p3 = new Pharmacy2();
//        p3.addComponents(azitronite, penicillin);
//
//        List<Component> components = new ArrayList<>();
//        components.add(water);
//        components.add(penicillin);
//        components.add(azitronite);
//
//        System.out.println(components);
//
//        Collections.sort(components, Comparator.reverseOrder());
//        System.out.println(components);
//
//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }
//
//        for (Component c : p2) {
//            System.out.println(c);
//        }

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite, penicillin);
        Pharmacy p2 = new Pharmacy();
        p2.addComponents(azitronite, penicillin);
        Pharmacy p3 = new Pharmacy();
        p3.addComponents(water);

        List<Pharmacy> phs = new ArrayList<>();
        phs.add(p1);
        phs.add(p2);
        phs.add(p3);

        System.out.println(phs);
        System.out.println("--------------------------------");

        Collections.sort(phs);
        System.out.println(phs);
    }
}
