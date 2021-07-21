package Lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Такое вот чудовище Франкенштейна...
 * в целом работает :)
 */
public class homeworkGame {
    public static void main(String[] args) {
        begin();
    }

    static void begin() {
        int diff= intro();                                          //вызываем метод intro и задаём сложность
        char[][] field = getField(diff);
        if (diff==5){
            diff-=1;
        }
        while (true) {
            showField(field);
            humanMove(field, diff);
            showField(field);
            cpMove(field);

            if (finalCheck(field, 'X', diff)) {
                System.out.println("Humanity wins!");
                break;
            }
            else if (finalCheck(field, '0', diff)) {
                System.out.println("Computer wins!");
                break;'
            }else if(draw(field)){                              //не понимаю почему он не хочет выполнять этот метод
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    static int intro (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        int diff;
        do {
            System.out.println("Please choose difficult from 3 to 5");
            diff = scanner.nextInt();
        } while (diff < 3 || diff > 5);
        return diff;
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
        } while (check(field, y, x));
        field[y][x] = 'X';
        return field;
    }

    static char[][] cpMove(char[][] field) {                            //метод аналогичен ходу игрока только
        Random random = new Random();                                   //вместо инпута тут рандомное число.
        int x, y;                                                       //честно,я смутно представляю как улучшить но...
        do {                                                            //тут будет такая тарабарщина что чёрт ногу сломит
            y = random.nextInt(field.length);                           //да и вряд ли у меня хватит на это времени и сил
            x = random.nextInt(field.length);                           //так что...пока что так.
        } while (check(field, y, x));
        field[y][x] = '0';
        return field;
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

    static boolean horizontal(char[][] field, char symb, int win) {      //проверка по горизонтали
        int checkForWin = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == symb) {
                    checkForWin++;
                    if (checkForWin == win) {
                        checkForWin = 0;
                        return true;
                    }
                }
            }
            checkForWin = 0;
        }
        return false;
    }

    static boolean vertical(char[][] field, char symb, int win) {       //проверка по горизонтали
        int checkForWin = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == symb) {
                    checkForWin++;
                    if (checkForWin == win) {
                        checkForWin = 0;
                        return true;
                    }
                }
            }
            checkForWin = 0;
        }
        return false;
    }

    static boolean diagonal(char[][] field, char symb, int win) {       //проверка по диагонали слева направо
        int checkForWin = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == symb) {
                checkForWin++;
            }
            if (checkForWin == win) {
                checkForWin = 0;
                return true;
            }
        }
        return false;
    }

    static boolean reverseDiagonal(char[][] field, char symb, int win) {//проверка по диагонали справа налево
        int checkForWin = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - i - 1] == symb) {
                checkForWin++;
            }
        }
        if (checkForWin == win) {
            return true;
        }
        return false;
    }

    static boolean draw(char[][] field) {                               //проверка на ничью

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                    if (field[i][j]=='*')return false;
                }
            }return true;
        }


    static boolean finalCheck(char[][] field, char symb, int input) {
        int win = 0;
        if (horizontal(field, symb, input) == true) win++;
        else if (vertical(field, symb, input) == true) win++;
        else if (diagonal(field, symb, input) == true) win++;
        else if (reverseDiagonal(field, symb, input)) win++;
        return win > 0;
    }
}


