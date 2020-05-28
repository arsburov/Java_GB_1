package ru.geekbrains.lesson06;

public class Animal {

    protected void run(int length){
        System.out.println(String.format("run: true, %s meters.%n", length));
    }
    protected void jump(double height){
        System.out.println(String.format("jump: true, %s meters.%n", height));
    }
    protected void swim(int length){
        System.out.println(String.format("swim: true, %s meters.%n", length));
    }
}
