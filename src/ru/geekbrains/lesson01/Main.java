package ru.geekbrains.lesson01;

public class Main {

    public static void main(String[] args) {

        variables();
        count(2.0f, 3.0f, 4.0f, 5.0f);
        System.out.println(count(2.0f, 3.0f, 4.0f, 5.0f));
        trueOrNot(4, 7);
        System.out.println(trueOrNot(15, 7));
        positiveOrNot(0);
        isNegative(14);
        System.out.println(isNegative(-14));
        hello("Максим");
        year(400);
    }

    static void variables(){
        byte myByte = 0;
        short myShort = 30000;
        int myInt = 2147483647;
        long myLong = 9223372036854775807L;
        float myFloat = 13.21f;
        double myDouble = 123.321;
        char myChar = 'c';
        boolean myBoolean = true;
    }

    static float count(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    static boolean trueOrNot(int a, int b){
        if ((a + b) > 10 && (a + b) <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    static void positiveOrNot(int a){
        if (a >= 0){
            System.out.println("Введенное число положительное.");
        }
        else {
            System.out.println("Введенное число отрицательное.");
        }
    }

    static boolean isNegative(int a){
        if (a < 0){
            return true;
        }
        else {
            return false;
        }
    }

    static void hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void year(int a){
        if ((a % 4 == 0) && (a % 100 != 0)){
            System.out.println(a + "год - это високосный год!");
        }
        else if (a % 400 == 0){
            System.out.println(a + "год - это високосный год!");
        }
        else {
            System.out.println(a + "год - это не високосный год!");
        }
    }
}
