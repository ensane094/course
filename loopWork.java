package LoopLesson;

public class loopWork {
    public static void main(String[] args) {
        firstCoube();
        secondCoube();
        thirthCoube();
        fourthCoube();
        fifthCoube();
        sixCoube();
        sevenCoube();
        eightCoube();
        nineCoube();
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
                    while (++j > i && j < 6) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }

    static void fourthCoube() {
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

    static void fifthCoube() {
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
    }

    static void sixCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 || i == 5 || i == j) {
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

    static void sevenCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 5 || j == 5) {
                    System.out.print("* ");
                } else if ((i == 4 && j == 1) || (i == 3 && j == 2) || (i == 2 && j == 3) || (i == 1 && j == 4)) {
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

    static void eightCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j == 2 || j == 3) && (i == 2 || i == 3)) {
                    System.out.print("  ");
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

    static void nineCoube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (((j == 0 || j == 1) && (i == 4 || i == 5)) || ((j == 4 || j == 5) && (i == 0 || i == 1))) {
                    System.out.print("  ");
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
}
