package ru.geekbrains.lesson07;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if (plate.decreaseFood(appetite)){
         satiety = true;
        }
    }

    public void info(){
        if(satiety){
            System.out.println(String.format("%s satiety %b", name, satiety));
        } else {
            System.out.println(String.format("%s satiety %b", name, satiety));
        }
    }
}
