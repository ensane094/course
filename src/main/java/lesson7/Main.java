package lesson7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(220);
        Cat[] cats = new Cat[6];
        {
            cats[0] = new Cat("Васька", 32);
            cats[1] = new Cat("Мурчик", 20);
            cats[2] = new Cat("Ванька", 13);
            cats[3] = new Cat("Дымок", 15);
            cats[4] = new Cat("Пушок", 60);
            cats[5] = new Cat("Тимофей", 101);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].eating(plate);
        }
        plate.addFood(100);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eating(plate);
        }
    }
}