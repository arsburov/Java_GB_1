package ru.geekbrains.lesson02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        doTask01();
        doTask02();
        doTask03();
        doTask04();
        doTask05();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(doTask06(array));
//        doTask07(array, 2);
    }

    static void doTask01(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                array[i] = 1;
            }else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void doTask02(){
        int[] array = new int[8];
        int number = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = number;
            number +=3;
        }
        System.out.println(Arrays.toString(array));
    }

    static void doTask03(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void doTask04(){
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                if (i == j){
                    table[i][j] = 1;
                }
            }
        }
    }

    static void doTask05(){
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            } else if (array[i] <= min){
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    static boolean doTask06(int[] array){
        int i = 0;
        int left = array[i];
        int right = 0;
        System.out.println(Arrays.toString(array));
        for (i = 1; i < array.length; i++){
            right += array[i];
            if (left == right){
                return true;
            }
        }
        for (i = 1; i < array.length; i++){
            left += array[i];
            right -= array[i];
            if (left == right){
                return true;
            }
        }
        return false;
    }

//    static void doTask07(int[] array, int n){
//        int z = array.length;
//        int a = array[n];
//        int b;
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++){
//            if((i + n) < array.length){
//                b = array[i + n];
//                array[i + n] = a;
//                a = b;
//            }
//        }
//            System.out.println(Arrays.toString(array));
//    }
}
