package ru.geekbrains.lesson06;

public class Cat extends Animal {
    protected int maxLength;
    protected double maxHeight;

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    protected void run(int length){
        if (length <= maxLength) {
            System.out.println(String.format("Cat run: true, %s meters.%n", length));
        } else {
            System.out.println(String.format("Cat run: false. Cat can`t run %s meters.%n", length));
        }
    }
    @Override
    protected void jump(double height){
        if (height <= maxHeight) {
            System.out.println(String.format("Cat jump: true, %s meters.%n", height));
        } else {
            System.out.println(String.format("Cat jump: false. Cat can`t jump %s meters.%n", height));
        }
    }
    @Override
    protected void swim(int length){
        System.out.println(String.format("Cat swim: false, Cat can`t swim", length));
    }
}
