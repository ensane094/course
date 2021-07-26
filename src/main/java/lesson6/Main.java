package lesson6;

public class Main {
    /**
     * Я вот не знаю, имя животного лучше в класс животного забивать или вот как у меня лучше?
     * а также нужно ли было прописывать геттеры и сеттеры
     * правда если прописывать геттеры и сеттеры то тогда имя животного должно быть в классе
     * конкретного животного
     * блин, это взрывает мозг :)
     */
    public static void main(String[] args) {
        Cat vaska = new Cat("Васька");
        vaska.run(800);
        vaska.swim(30);
        Cat murchik = new Cat("Мурчик");
        murchik.run(60);
        murchik.swim(20);
        Dog barbos = new Dog("Барбос");
        barbos.run(400);
        barbos.swim(90);
        Dog muhtar = new Dog("Мухтар");
        muhtar.run(260);
        muhtar.swim(20);
        System.out.println("Собак создано: " + muhtar.getDogCount());                         //тк объекта класса энимал
        System.out.println("Котов создано: " + murchik.getCatCount());                         //я не создавал то вывел количество
        System.out.println("Всего животных создано: " + muhtar.getAnimalCount());              //животных через мухтара
    }
}
