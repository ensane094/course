package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class homeworkGame {
    public static void main(String[] args) {
        begin();
    }


    static void begin() {
        System.out.println();
        char[][] field = getField(5);
        while (true) {

            showField(field);
            humanMove(field, 5);
            showField(field);
            System.out.println(0 + 6 - 0);
            System.out.println(1 + 5 - 2);
            System.out.println();
            //cpMove(field);
            System.out.println(diagonal(field, 5));

        }
    }


    static void showField(char[][] field) {                         //Рисуем поле
        System.out.println("The game!");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + 1 + " : ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    static int getCoordinate(char ch, int n) {                            //метод для ввода координат
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please enter %s coordinate (in range 0-%s)%n", ch, n);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > n + 1);
        return coordinate;
    }

    static boolean check(char[][] field, int y, int x) {        //условие для проверки дубликата
        return field[y][x] != '*';
    }

    static char[][] humanMove(char[][] field, int n) {                 //метод для проверки дубликата
        int x, y;                                                //вызывает метод getCoordinate
        do {                                                    //и возвращает изменённый массив
            y = getCoordinate('Y', n);
            x = getCoordinate('X', n);
        } while (check(field, y, x));
        field[y][x] = 'X';
        return field;
    }

    static char[][] cpMove(char[][] field) {                    //метод аналогичен ходу игрока только
        Random random = new Random();                             //вместо инпута тут рандомное число
        int x, y;
        do {
            y = random.nextInt(field.length);                   // ставит два нолика если нет два креста
            x = random.nextInt(field.length);                   // иначе ставит туда где один нолик
        } while (check(field, y, x));
        field[y][x] = '0';
        return field;
    }

    static char[][] getField(int n) {                           //метод возвращающий поле в зависимости от
        char[][] field = new char[n][n];                        //выбора сложности
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = '*';
            }
        }
        return field;
    }

    static boolean horizontal(char[][] field, int n) {                 //проверка по горизонтали
        int checkForWin = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 'X') {
                    checkForWin++;
                    if (checkForWin == field.length) {
                        checkForWin = 0;
                        System.out.println(checkForWin);
                        return true;
                    }
                }
            }
            checkForWin = 0;
        }
        return false;
    }

    static boolean vertical(char[][] field, int n) {                 //проверка по горизонтали
        int checkForWin = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == 'X') {
                    checkForWin++;
                    if (checkForWin == field.length) {
                        checkForWin = 0;
                        System.out.println(checkForWin);
                        return true;
                    }
                }
            }
            checkForWin = 0;
        }
        return false;
    }

    static boolean diagonal(char[][] field, int n) {                 //проверка по диагонали слева направо
        int checkForWin = 0;
        int fLength = field.length - 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 'X' && i == j) {
                    System.out.println("ssss");
                    checkForWin++;
                    System.out.println(checkForWin);
                }
            }if (checkForWin == field.length) {
                checkForWin = 0;
                System.out.println(checkForWin);
                return true;

            }
        }return false;
    }

    static boolean reverseDiagonal(char[][] field, int n) {         //проверка по диагонали справа налево
        int checkForWin = 0;
        for (int i = field.length - 1; i >= 0; i--) {
            if (field[i][i] == 'X') {
                for (int j = field.length - 1; j < 0; j--) {
                    if (field[i][j] == 'X' && i == j) {
                        System.out.println("ssss");
                        checkForWin++;
                        System.out.println(checkForWin);
                        if (checkForWin == field.length) {
                            checkForWin = 0;
                            System.out.println(checkForWin);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
       /* static boolean winCon ( char[][] field){

            for (int i = 0; i < field.length; i++) {
                for (int j = field.length; j > 0; j--) {

                }
            }
        }*/


