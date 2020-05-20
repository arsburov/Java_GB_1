package ru.geekbrains.lesson03;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doTask01();
        doTask02();
    }

    static void doTask01() {
        Random random = new Random();
        int number = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 0 до 9, у Вас есть 3 попытки чтобы его угадать.\nВведите число ...");
        int userAnswer = scanner.nextInt();
        for (int i = 2; i > 0; i--) {
            if (userAnswer == number) {
                System.out.println("Вы угадали! Загаданное число - " + number + "\nХотите сыграть еще? 1 - Да / 0 - Нет ...");
                userAnswer = scanner.nextInt();
                if (userAnswer == 1) {
                    doTask01();
                } else if (userAnswer == 0) {
                    System.out.println("Спасибо за игру! Всего доброго!");
                    return;
                }
            } else if (userAnswer > number) {
                System.out.println("Введенное Вами число больше загаданного.\nПопробуйте еще, у Вас осталось попыток: " + i + ".");
                userAnswer = scanner.nextInt();
            } else if (userAnswer < number) {
                System.out.println("Введенное Вами число меньше загаданного.\nПопробуйте еще, у Вас осталось попыток: " + i + ".");
                userAnswer = scanner.nextInt();
            }
        }
        if (userAnswer == number) {
            System.out.println("Вы угадали! Загаданное число - " + number + "\nХотите сыграть еще? 1 - Да / 0 - Нет ...");
            userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                doTask01();
            } else if (userAnswer == 0) {
                System.out.println("Спасибо за игру! Всего доброго!");
                return;
            }
        } else {
            System.out.println("К сожалению, Вы проиграли! Загаданное число - " + number + "\nХотите сыграть еще? 1 - Да / 0 - Нет ...");
            userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                doTask01();
            } else if (userAnswer == 0) {
                System.out.println("Спасибо за игру! Всего доброго!");
                return;
            }
        }
    }

    static void doTask02() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int arrayLength = words.length;
        Random random = new Random();
        int numberForChoosingOfWord = random.nextInt(arrayLength);
        String computerChoose = words[numberForChoosingOfWord];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал слово из списка: \n\"apple, orange, lemon, banana, apricot, \navocado, broccoli, carrot, cherry, garlic, \ngrape, melon, leak, kiwi, mango, \nmushroom, nut, olive, pea, peanut, \npear, pepper, pineapple, pumpkin, potato\".\nПопробуйте угадать какое. \nВведите Ваш вариант ...");
        String userAnswer = scanner.nextLine();
        userAnswer = userAnswer.toLowerCase();

        boolean trueOrFalse;
        trueOrFalse = computerChoose.equals(userAnswer);
        while (trueOrFalse != true) {
            char c = computerChoose.charAt(0);
            int lengthOfComputersWord = computerChoose.length();
            int lengthOfUsersWord = userAnswer.length();
            for (int i = 0; i < 15; i++) {
                if (i < lengthOfComputersWord && i < lengthOfUsersWord) {
                    if (computerChoose.charAt(i) == userAnswer.charAt(i)) {
                        System.out.print(computerChoose.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("\nПопробуйте снова ...");
            userAnswer = scanner.nextLine();
            trueOrFalse = computerChoose.equals(userAnswer);
        }
        System.out.println("Поздравляем! Вы выиграли. Загаданное слово - " + computerChoose);
    }
}