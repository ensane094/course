package Lesson4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

            char[][] field = getField(3);
            while (true) {
                System.out.println(draw(field));
                humanMove(field, 3);
                showField(field);
            }
    }

    static void showField(char[][] field) {                             //Рисуем поле
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
    static char[][] getField(int n) {                                   //метод возвращающий поле в зависимости от
        char[][] field = new char[n][n];                                //выбора сложности
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = '*';
            }
        }
        return field;
    }

    static int getCoordinate(char ch, int n) {                          //метод для ввода координат
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please enter %s coordinate (in range 1-%s)%n", ch, n);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > n + 1);
        return coordinate;
    }

    static boolean check(char[][] field, int y, int x) {                //условие для проверки дубликата
        return field[y][x] != '*';
    }

    static char[][] humanMove(char[][] field, int n) {                  //ход игрока
        int x, y;
        do {
            y = getCoordinate('Y', n);
            x = getCoordinate('X', n);
        } while (check(field, y, x)&&!draw(field));
        field[y][x] = 'X';
        return field;
    }


    static boolean draw(char[][] field) {//проверка на ничью
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '*') return false;
            }
        }
        return true;
    }
}
