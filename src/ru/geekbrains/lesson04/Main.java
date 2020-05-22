package ru.geekbrains.lesson04;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    playTicTacToe();
    }

    static void playTicTacToe(){
        char[][] field = getField(3,3);
        drawField(field);

        char playerSign = 'X';
        char computerSign = 'O';
        char currentPlayerSign = playerSign;
        String currentPlayerName = "John";

        boolean isWin;
        boolean isDraw;
        do{
            move(field, currentPlayerSign);
            isWin = checkWin(field, currentPlayerSign);
            isDraw = checkDraw(field);

            if (!isWin){
                currentPlayerSign = currentPlayerSign == playerSign ? computerSign : playerSign;
                currentPlayerName = currentPlayerSign == playerSign ? "John" : "computer";
                drawField(field);
                if (isDraw){
                    System.out.println("This is DRAW!!!");
                    drawField(field);
                    return;
                }
            }
        } while (!isWin);
        System.out.println(String.format("Congratulations! The winner is - Mr.%s", currentPlayerName));
        drawField(field);
    }

    static char[][] getField(int x, int y){
        char[][] field = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }

    static void drawField(char[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static void move(char[][] field, char currentPlayerSign){
        if (currentPlayerSign == 'X'){
            playerMove(field, currentPlayerSign);
        } else{
            computerMove(field, currentPlayerSign);
        }
    }

    static void playerMove(char[][] field, char playerSign){
        int x;
        int y;

        boolean isEmptyCell;
        do {
            boolean isValidCoordinates;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println(String.format("Input X-coordinates (1, 2, 3):"));
                x = scanner.nextInt() - 1;
                System.out.println(String.format("Input Y-coordinates (1, 2, 3):"));
                y = scanner.nextInt() - 1;

                isValidCoordinates = checkValid(x, y);
                notifyNotValidCoordinates(isValidCoordinates);
            } while (!isValidCoordinates);

            isEmptyCell = isCellEmpty(field, x, y);
            notifyOccupiedCoordinates(isEmptyCell, x, y);
        } while (!isEmptyCell);

        field[x][y] = playerSign;

    }

    static void notifyOccupiedCoordinates(boolean isEmptyCell, int x, int y){
        if (!isEmptyCell){
            System.out.println(String.format("Input coordinates are not valid. Cell of %s, %s is already occupied. Please input correct.", x, y));
        }
    }

    static void computerMove(char[][] field, char currentPlayerSign){
        int x;
        int y;

        Random random = new Random();

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellEmpty(field, x, y));
        System.out.println("Computer`s move...");
        System.out.println(String.format("Computer chooses %s, %s coordinates", x, y));
        field[x][y] = currentPlayerSign;
    }


    static boolean checkValid(int x, int y){
        return (x >= 0 && x <= 2) && (y <= 2 && y >= 0);
    }

    static void notifyNotValidCoordinates(boolean isValidCoordinates){
        if (!isValidCoordinates){
            System.out.println("Input coordinates are not valid. Valid range of coordinates - (1, 2, 3).");
        }
    }

    static boolean isCellEmpty(char[][] field, int x, int y){
        return field[x][y] == '-';
    }

    static boolean checkWin(char[][] field, char currentPlayerSign){
        if (checkHorizontalWin(field,currentPlayerSign)) {
            return true;
        }
        if (checkVerticalWin(field,currentPlayerSign)) {
            return true;
        }
        if (checkDiagonalWin(field,currentPlayerSign)) {
            return true;
        }
        return false;
    }

    static boolean checkHorizontalWin(char[][] field, char currentPlayerSign){
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == currentPlayerSign && field[i][1] == currentPlayerSign && field[i][2] == currentPlayerSign){
                return true;
            }
        }
        return false;
    }

    static boolean checkVerticalWin(char[][] field, char currentPlayerSign){
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == currentPlayerSign && field[1][i] == currentPlayerSign && field[2][i] == currentPlayerSign){
                return true;
            }
        }
        return false;
    }

    static boolean checkDiagonalWin(char[][] field, char currentPlayerSign){
        if (field[0][0] == currentPlayerSign && field[1][1] == currentPlayerSign && field[2][2] == currentPlayerSign){
            return true;
        } else if (field[0][2] == currentPlayerSign && field[1][1] == currentPlayerSign && field[2][0] == currentPlayerSign){
            return true;
        }
        return false;
    }


//    static void computerRandomMove(char[][] field, char currentPlayerSign){
//        int x;
//        int y;
//
//        Random random = new Random();
//
//        do {
//            x = random.nextInt(3);
//            y = random.nextInt(3);
//        } while (!isCellEmpty(field, x, y));
//        System.out.println("Computer`s move...");
//        System.out.println(String.format("Computer chooses %s, %s coordinates", x, y));
//        field[x][y] = currentPlayerSign;
//    }

    static boolean checkDraw(char[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }
}

