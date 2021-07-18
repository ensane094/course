package lesson3;

public class homework {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3};
        eightTask(array, -2);
    }

    static void firstTask() {
        int[] array = {1, 0, 1, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    static void secondTask() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; ) {
            int o = array[i];
            array[i] = ++i;
        }
    }

    static void thirdthTask() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    static void fourthTask() {
        int[][] array = new int[4][4];
        int length = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][length] = 1;
            length--;
        }
    }

    static int[] fifthTask(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    static void sixTask() {
        int[] array = {90, 89, 26, 8, 2, 4, 2, 70};
        int max = 0;
        int min = 0;
        for (int i : array) {                           // i принимает значение одного из значений массива
            if (i > max) {                              // подставляем значения max и min которые будут постоянно сравниваться
                max = i;                                // если i > max то обновляем значение max и чтобы минимальное значение вступило в игру добавляем и его тоже
                min = i;                                // всё сравнивается и, вроде как, работает :)
            } else if (i < min || i == min) {
                min = i;
            }
        }
    }

    static boolean sevenTask(int[] array) {                     //передаём в параметрах массив
        int half = array.length / 2;                            // делим его пополам (ну, не прям конечно...
        int sum1 = 0;                                           // ведь если длинна- нечётное число то одна сторона будет больше
        int sum2 = 0;                                           // а другая меньше....
        for (int i = 0; i < half; i++) {                        // далее выясняем сумму первой половины массива и задаём значение sum1
            sum1 += array[i];
        }
        for (int i = array.length - 1; i >= half; i--) {        // выясняем сумму второй половины массива и задаём значение sum2
            sum2 += array[i];
        }
        return sum1 == sum2;                                    // если условие верно возвращаем true, если нет- вернётся false
    }


    static void eightTask(int[] array, int n) {
        if (n > 0) {

            for (int i = 0; i < n; i++) {
                int temp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }

        } else {
            for (int i = 0; i > n; i--) {
                int tempo =0;
                int temp = array[0];
                for (int j = 0; j < array.length; j++) {
                    tempo++;
                    if (tempo==array.length){
                        array[array.length-1] = temp;
                        break;
                    }
                    array[j] = array[tempo];
                }

            }
        }
    }
}



