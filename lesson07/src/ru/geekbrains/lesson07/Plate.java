package ru.geekbrains.lesson07;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n){
        if(food < n){
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void increaseFood(int n){
        food += n;
    }

    public void info(){
        System.out.println(String.format("plate: %d", food));
    }
}
