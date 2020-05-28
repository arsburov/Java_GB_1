package ru.geekbrains.lesson06;

public class Main {

    public static void main(String[] args) {
        doTask();
    }
    static void doTask(){
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Cat cat2 = new Cat();

        cat1.setMaxHeight(4);
        cat1.setMaxLength(251);
        dog1.setMaxHeight(5);
        dog1.setMaxLength(500);
        cat2.setMaxHeight(2);
        cat2.setMaxLength(100);

        cat1.run(250);
        cat1.jump(3);
        dog1.run(500);
        dog1.jump(4);
        cat2.run(50);
        cat2.jump(0.3);
    }
}
