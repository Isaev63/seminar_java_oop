package main;

import main.util.MyLinkedList;

public class ArrayListMain {
    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//
//        list.add(3);
//        list.add(5);
//        list.add(6);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.size());

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(5);
        list.addLast(9);
        list.addLast(1);
        list.addFirst(2);

        System.out.println("Размер списка: " + list.size());
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Элемент по индексу " + i + ": " + list.get(i));
        }
    }
}