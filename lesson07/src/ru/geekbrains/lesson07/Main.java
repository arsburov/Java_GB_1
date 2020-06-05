package ru.geekbrains.lesson07;

public class Main {

    public static void main(String[] args) {
	    doTask();
    }
    static void doTask(){
        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Django", 9);
        catsArray[1] = new Cat("Maison", 7);
        catsArray[2] = new Cat("Black", 6);
        catsArray[3] = new Cat("Murzik", 3);
        catsArray[4] = new Cat("Barsik", 5);

        Plate plate = new Plate(23);
        plate.info();

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            catsArray[i].info();
        }

        plate.increaseFood(5);
        catsArray[3].eat(plate);
        catsArray[3].info();
    }
}
