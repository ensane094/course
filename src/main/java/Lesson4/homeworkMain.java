package Lesson4;

public class homeworkMain {
    public static void main(String[] args) {
        firstCoube();
        secondCoube();
        thirthCoube();
        //fourthCoube();
        //fifthCoube();
    }
    static void firstCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }

    static void secondCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }

    static void thirthCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    System.out.print("  ");
            }else {
                    System.out.print("*");
                }
            System.out.println();
        }
    }}

    /*static void fourthCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }

    //static void fifthCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }*/
}
