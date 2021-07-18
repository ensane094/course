package Lesson4;

import java.util.Scanner;

public class homeworkGame {
    public static void main(String[] args) {
        begin();
    }


    static void begin() {
        Scanner scanner=new Scanner(System.in);
        char[][] field = {
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
        showField(field);
        int hor;
        int ver;
        do {
            System.out.println("Please enter coordinates");
            hor=scanner.nextInt();
            ver=scanner.nextInt();
        } while (hor < 0 || ver > 3);
        showField(field);
    }

    static void showField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        /*static void input () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи число1");
            int hor = scanner.nextInt() - 1;
            System.out.println("Введи число2");
            int ver = scanner.nextInt() - 1;
            field[hor][ver] = 'X';
        }*/

    }
}


