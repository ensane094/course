package Lesson4;

import java.util.Scanner;

public class homeworkGame {
    public static void main(String[] args) {
        begin();
    }


    static void begin() {
        char[][] field = {
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };

        showField(field);
        ultimateMove(field);

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

    static int getCoordinate(char ch) {                            //метод для ввода координат
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please enter %s coordinate (in range 1-3)%n", ch);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > 2);
        return coordinate;
    }

    static char[][] ultimateMove(char[][] field) {              //метод для проверки дубликата
        int x;                                                  //вызывает метод getCoordinate
        int y;                                                  //возвращает массив
        do {
            y = getCoordinate('Y');
            x = getCoordinate('X');
        } while (field[y][x] != '*');
        field[y][x] = 'X';
        return field;
    }
}


    /*static char[][] getAllCoordinate(char[][] field) {   //я хотел использовать этот метод
        Scanner scanner = new Scanner(System.in);       //для получения координат
        int x;                                          //но так и не нашёл решения
        int y;                                          //в случае повтора значения =(
        do {
            System.out.println("Please enter Y coordinate!(in range: 1-3)");
            y = scanner.nextInt() - 1;
        } while (y < 0 || y > 3);
        do {
            System.out.println("Please enter X coordinate!(in range: 1-3)");
            x = scanner.nextInt() - 1;

        } while (x < 0 || x > 3);
        field[y][x] = 'X';
        return field;
    }*/
