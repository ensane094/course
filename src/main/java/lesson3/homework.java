package lesson3;

public class homework {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3};
        eightTask(array, 2);
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

    /**
     * Я не могу это решить! Не понимаю как! Просто не понимаю!
     * Думаю надо создать переменные которые будут записывать в себя значения
     * элементов а потом их между собой менять но у меня не получается это сделать! Я уже 8 часов думаю над этим и
     * терпение уже на исходе, как и силы продолжать. Это жесть какая-то!
     * может есть какая-нибудь команда чтобы менять их местами но я такой не знаю и в методичке подсказок я не нашёл.
     * А в инете искать не стал. Ещё чуть-чуть и волосы рвать на себе начну, с меня хватит. Я не смогу до начала урока дописать
     * это задание, так что сдаю как есть. К сожалению моих сил не хватает это решить
     */
    static void eightTask(int[] array, int n) {
        if (n > 0) {

            //(0)1,(1)2,(2)3,(3)1,(4)2,(5)3
            OUTER:
            for (int i = 0; i < n; i++) {
                int o = array[array.length - 1];
                int idk =1;
                int idk1=2;
                int y=0;

                for (int j = 0; j < array.length; j++) {
                    y=array[idk];
                    array[idk]=array[j];
                    array[idk1]=y;
                    idk++;
                    if(idk1!=array[array.length-1]){
                        idk1++;
                    }

                    if (idk == array[array.length-1]){
                        array[0]=o;
                      break;
                    }

                }
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k]);
                }
                System.out.println(" ");

            }
        }
    }
}



