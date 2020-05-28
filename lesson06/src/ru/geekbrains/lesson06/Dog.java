package ru.geekbrains.lesson06;

public class Dog extends Animal {
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
            System.out.println(String.format("Dog run: true, %s meters.%n", length));
        } else {
            System.out.println(String.format("Dog run: false. Dog can`t run %s meters.%n", length));
        }
    }
    @Override
    protected void jump(double height){
        if (height <= maxHeight) {
            System.out.println(String.format("Dog jump: true, %s meters.%n", height));
        } else {
            System.out.println(String.format("Dog jump: false. Dog can`t jump %s meters.%n", height));
        }
    }
    @Override
    protected void swim(int length){
        if (length <= maxLength) {
            System.out.println(String.format("Dog swim: true, %s meters.%n", length));
        } else {
            System.out.println(String.format("Dog swim: false. Dog can`t run %s meters.%n", length));
        }
    }
}
